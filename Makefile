
build:
	@ find . -name "*.java" | while read file; do \
		echo "Compliing: file=$${file}" ; \
		javac $${file} ; \
	done

run: build
	@ find . -name "*.java" | while read file; do \
        echo "" ; \
		echo "Running: file=$${file}" ; \
		java $${file} ; \
	done

clean:
	@ find . -name "*.class" | while read file; do \
		echo "Removing file: file=$${file}" ; \
		rm -f $${file} ; \
	done
