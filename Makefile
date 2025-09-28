
build:
	@  \
	echo "==> " javac -cp ./choreo_gen choreo_gen/Solo.java ; \
	javac -cp ./choreo_gen choreo_gen/Solo.java ; \
	\
	echo "==> " javac -cp ./choreo_gen choreo_gen/BodyPart.java ; \
	javac -cp ./choreo_gen choreo_gen/BodyPart.java ; \
	\
	echo "==> " javac -cp ./choreo_gen choreo_gen/FinalSolo.java ; \
	javac -cp ./choreo_gen choreo_gen/FinalSolo.java ; \
	\
	echo "==> " javac -cp ./choreo_gen choreo_gen/FirstSolo.java ; \
	javac -cp ./choreo_gen choreo_gen/FirstSolo.java ; \
	\
	echo "==> " javac -cp ./choreo_gen choreo_gen/ModelPoses.java ; \
	javac -cp ./choreo_gen choreo_gen/ModelPoses.java ; \
	\
	echo "==> " javac -cp ./choreo_gen choreo_gen/ChoreoGen.java ; \
	javac -cp ./choreo_gen choreo_gen/ChoreoGen.java

format:
	@ java -jar ~/Downloads/google-java-format-1.27.0-all-deps.jar -r choreo_gen/*.java

run: build
	@ java -cp ./choreo_gen ChoreoGen

clean:
	@ find . -name "*.class" | while read file; do \
		echo "Removing file: file=$${file}" ; \
		rm -f $${file} ; \
	done
