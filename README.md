# SET_Oblig3
I denne obligen fikk jeg i oppgave å sette opp Github Actions, slik at testene jeg skrev i oppgave 2 blir kjørt hver gang du committer til repositoryet og gjør git push.
Jeg startet dermed oppgaven med å legge til versjonskontroll i Oblig 2 prosjektet mitt, og lastet opp prosjektet til dette repositoriet via intelliJ.
Deretter la jeg til .github og workflows mappe ved å følge denne instruksjonen: https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven
Jeg hadde litt trøbbel med feilmeldinger i Actions. Jeg måtte gjøre følgende steps for å få det til å fungere: 
- la til name: Run Test run: mvn test i yml filen
- Endre .yml fil til å bruke riktig java versjon 
- Fjernet optional i malen fra github (Dette ga for første gang grønne tester, men det ser ikke ut til at noen av testene mine faktisk ble kjørt)
- Endre pom filen til å bruke en spesifikk versjon av JUnit (5.9.1) *
- Legge til maven-surefire-plugin i pom fil. *

* Kilde https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html
