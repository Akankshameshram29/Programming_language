#import Signatures

class Tx:
    def __init__(self):
        self.inputs = []
        self.outputs = []
        self.sigs = []
        self.reqd = []

    def add_input(self, from_addr, amount):
        self.inputs.append((from_addr, amount))

    def add_output(self, to_addr, amount):
        self.outputs.append((to_addr, amount))

    def add_reqd(self, addr):
        self.reqd.append(addr)

    def sign(self, private):
        message = self.__gather()  # Now correctly refers to the method inside the class
        newsig = Signatures.sign(message, private)
        self.sigs.append(newsig)

    def is_valid(self):
        total_in = 0
        total_out = 0
        message = self.__gather()

        for addr, amount in self.inputs:
            found = False
            for s in self.sigs:
                if Signatures.verify(message, s, addr):
                    found = True
            if not found:
                print("Reason for Failure: No good sig found for given message")
                return False
            if amount < 0:
                return False
            total_in += amount  # Fix indentation; this should execute if amount is valid

        for addr in self.reqd:
            found = False
            for s in self.sigs:
                if Signatures.verify(message, s, addr):
                    found = True
            if not found:
                return False

        for addr, amount in self.outputs:
            if amount < 0:
                return False
            total_out += amount

        if total_out > total_in:
            print("Reason for Failure: Outputs exceed inputs")
            return False

        return True

    def __gather(self):  # Now correctly inside the class
        data = []
        data.append(self.inputs)
        data.append(self.outputs)
        data.append(self.reqd)
        return data
