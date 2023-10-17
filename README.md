# SET_Oblig3 Vetle Marentius Nilsen
I denne obligen fikk jeg i oppgave å sette opp Github Actions, slik at testene jeg skrev i oppgave 2 blir kjørt hver gang du committer til repositoryet og gjør git push.
Jeg startet dermed oppgaven med å legge til versjonskontroll i Oblig 2 prosjektet mitt, og lastet opp prosjektet til dette repositoriet via intelliJ.
Deretter la jeg til .github og workflows mappe ved å følge denne instruksjonen: https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven

Jeg hadde litt trøbbel med feilmeldinger i Actions. Jeg måtte gjøre følgende steps for å få det til å fungere: 
- la til: name: Run Test  run: mvn test i yml filen
- Endret .yml fil til å bruke riktig java versjon 
- Fjernet optional i malen fra github (Dette ga for første gang Action-grønne tester, men det ser ikke ut til at noen av JUnit-testene mine faktisk ble kjørt)
- Endret pom filen til å bruke en spesifikk versjon av JUnit (5.9.1) **
- La til maven-surefire-plugin i pom fil. (Etter dette steget kjører alle testene i actions)**

Jeg la i tillegg til en configuration i plugin som jeg senere slettet, da denne ikke gjorde noen forskjell i loggen.
Med alle disse endringene kan kan nå se i Actions loggen at testene er kjørt, og resultat på testene. 
"Tests run: 4, Failures: 0, Errors: 0, Skipped: 0"

** Kilde https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html
