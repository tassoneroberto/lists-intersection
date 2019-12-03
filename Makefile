clean:
	mvn clean

build: clean
	mvn javafx:compile

run:
	mvn javafx:run
