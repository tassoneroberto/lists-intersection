clean:
	mvn clean

build: clean
	mvn install

run:
	mvn javafx:run
