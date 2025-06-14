from flask import Flask

app = Flask(__name__)

@app.route("/")
def welcome():
    return 'welcome to the home page.'

@app.route("/index")
def index():
    return 'welcome to the index page.'

if __name__ == "__main__":
    app.run(debug = True)