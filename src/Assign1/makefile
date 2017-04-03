SUFFIXES: .java .class
.java .class:
	javac -g $ *.java
CLASSES = ReadData.java SearchItLinear.java
classes: $(CLASSES: .java=.class)

clean:
	rm *.class
