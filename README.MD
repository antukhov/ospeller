### Oracle English Word Spell Auto Correction

#### Architecture

Application based on the simple single responsibility pattern

#### Sequence of processors

1. Trim the input
2. Remove digits and special symbols
3. ~~Replace non English symbols to the similar English words~~
4. Remove repeatable letters / adjacent duplicates
5. ~~Dictionary of 10000k popular words (load once to hashset allocated in memory) + Levenshtein distance~~

#### How to run

`cd /%PROJECT_ROOT%`

`./gradlew --quiet --console=plain runWithExecJarExecutable`

#### Tools

Gradle

JUnit

#### Resources

Levenshtein Distance Implementation: https://www.baeldung.com/java-levenshtein-distance

Remove adjacent duplicates https://www.geeksforgeeks.org/recursively-remove-adjacent-duplicates-given-string/

#### Author

Aleksandr Antukhov
