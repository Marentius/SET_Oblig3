# SET_Oblig3
I denne obligen fikk jeg i oppgave å sette opp Github Actions, slik at testene jeg skrev i oppgave 2 blir kjørt hver gang du committer til repositoryet og gjør git push.
Jeg startet dermed oppgaven med å legge til versjonskontroll i Oblig 2 prosjektet mitt, og lastet opp prosjektet til dette repositoriet via intelliJ.
Deretter la jeg til .github og workflows mappe ved å følge denne instruksjonen: https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven
Jeg hadde litt trøbbel med feilmeldinger i Actions. Jeg måtte gjøre følgende steps for å få det til å fungere: 
- Endre .yml fil til å bruke riktig java versjon 
- 