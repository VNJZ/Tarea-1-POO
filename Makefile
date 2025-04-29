JAVAC = javac
JAVA = java
MAIN = main
CONFIG = config.txt

all: compile run

compile:
	$(JAVAC) *.java

run:
	$(JAVA) $(MAIN) $(CONFIG)
clean:
	rm -f *.class
