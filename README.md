# SamsungLabo
# Aplikacja KM

###### CZĘŚĆ ZAŁOŻEŃ APLIKACJI I WYMAGAŃ FUNKCJONALNYCH I NIEFUNKCJONALNYCH


- [x] Zainicjowanie projektu
- [x] Ustawienie dependencies i ustawień gradle
- [x] Utworzenie layoutu pod aktywnosci / fragenty
- [x] Utworzenie layoutu pod adaptery
- [x] Przejścia między oknami
- [ ] Logika uzyskiwania danych (JSON)
- [ ] Parsowanie danych
- [ ] Zapisywanie do database
- [ ] Programowanie zdarzeń
- [ ] generowanie elementów na zdarzenia

UZUPEŁNIĆ ETAPY

1.Jan  jest  na  przystanku  przy  ulicy  Klonowica  Zajezdnia  i  chce  dojechać  na  Kołłątaja.  
Chciałby  sprawdzić  jaki  środek  transportu  mu  to  umożliwi.   
 a)Jan  uruchamia  aplikację  i  widzi  swoje  położenie  na  mapie  
 b)Klika  w  przycisk  „Wyznacz  trasę”c)Przy  polu  „Z”  klika  w  przycisk  „Moja  lokalizacja”
 d)W  polu  „Do”  wpisuje  adres  docelowy  e)Klika  w  przycisk  „Wyszukaj”
 f)Jan  widzi  listę  autobusów  oraz  tramwajów,  które  zatrzymująsię  na  jego  przystanku  oraz  czas  do  odjazdu  
 
 2.Jan  jest  na  przystanku  przy  ulicy  Klonowica  Zajezdnia  i  czeka  na  autobus  nr  60.  
 Chciałby  siędowiedzieć,  o  której  przyjedzie.  
 a)Jan  uruchamia  aplikację  i  widzi  swoje  położenie  na  mapie  b)Klika  w  przycisk  „Wszystkie  rozkłady”  i  
 wybiera  linię  nr  60  c)Jan  widzi  listę  wszystkich  przystanków  przypisanych  do  danej  linii  a  najbliższy  
 z  nich  jest  oznaczony  innym  kolorem  d)Wybiera  przystanek  oznaczony  jako  „Klonowica  Zajezdnia”
 e)Jan  widzi  godziny  przyjazdów  autobusów,  czas  jaki  pozostał  do  odjazdu  oraz  kierunek  jazdy  (przystanek  docelowy)  
 
 3.Jan  jest  na  przystanku  przy  ulicy  Klonowica  Zajezdnia  i  czeka  na  autobus  nr  60.  
 Chciałby  siędowiedzieć  czy  autobus  będzie  na  czas  czy  przyjedzie  później.  
 a)Jan  uruchamia  aplikację  i  widzi  swoje  położenie  na  mapie  b)Klika  w  przycisk  „Wszystkie  rozkłady” 
 i  wybiera  linię  nr  60  
 c)Jan  widzi  listę  wszystkich  przystanków  przypisanych  do  danej  linii  a  najbliższy  z  nich  jest  
 oznaczony  innym  kolorem  d)Wybiera  przystanek  oznaczony  jako  „Klonowica  Zajezdnia”
 e)Jan  widzi  godziny  przyjazdów  autobusów  a  przy  tym  najbliższym  kolorowe  oznaczenie  czasowe 
 z  informacją  czy  autobus  przyjedzie  na  czas  czy  będzie  spóźniony  -  jeśli  będzie  na  czas,  
 Jan  zobaczy  w  kolumnie  „Opóźnienia”  zielony  napis  „0  minut”-  jeśli  będzie  opóźniony  o  np.  2  minuty
 Jan  zobaczy  w  kolumnie  „Opóźnienia”  czerwony  napis  „-2  minuty”-  jeśli  autobus  miałby  przyjechać  
 szybciej  o  np.  2  minuty,  Jan  zobaczy  w  kolumnie  „Opóźnienia”  xx  napis  „+2  minuty”
 //  
ustalić  czy  w  razie  szybszego  przyjazdu  autobusu  informacja  o  opóźnieniu  także  powinna  być  czerwona  czy  innego  koloru  
4.Jan  jest  w  domu  i  chce  dojechać  na  Plac  Rodła  LOT. 
 Chciałby  wiedzieć  na  jaki  przystanek  musi  sięudać  i  z  jakiego  środka  transportu  skorzystać. 
 a)Jan  uruchamia  aplikację  i  widzi  swoje  położenie  na  mapie  
 b)Klika  w  przycisk  „Wyznacz  trasę”c)Przy  polu  „Z”  klika  w  przycisk  „Moja  lokalizacja”
 d)W  polu  „Do”  wpisuje  adres  docelowy  e)Klika  w  przycisk  „Wyszukaj”
f)Jan  widzi  listę  autobusów  oraz  tramwajów,  które  zatrzymująsię  w  jego  okolicy  i  czas  ich  
odjazdu  g)Na  liście  obok  danego  środka  komunikacji  widzi  ikonę„Pokaż  na  mapie”,  
który  wycentruje  mapę  na  danym  przystanku  h)Jeśli  Jan  przytrzyma  palec  nad   środkiem  transportu  pojawi 
 się  chmurka  z  dodatkowymi  informacjami,  jak  nazwa  przystanku,  z  którego  odjeżdża  oraz  przystanek  końcowy  
 5.Jan  jest  na  przystanku  przy  ulicy  Kołłątaja,  chce  dojechać  na  ulicęŻołnierską  i  wie,  że  musi  wsiąść  do  autobusu  nr  53  bądź  60.  
 Chce  wiedzieć,  o  której  autobusy  będą  na  jego  przystanku  i  ile  czasu  trwa  dojazd  do  celu  obu  z  nich.  
 a)Jan  uruchamia  aplikację  i  widzi  swoje  położenie  na  mapie  
 b)Klika  w  przycisk  „Wyznacz  trasę”
 c)Przy  polu  „Z”  klika  w  przycisk  „Moja  lokalizacja”d)W  polu  „Do”  wpisuje  adres  docelowy  
 e)Klika  w  przycisk  „Wyszukaj”
 f)Jan  widzi  listę  autobusów  oraz  tramwajów,  które  zatrzymująsię  w  jego  okolicy,  czas  do  ich  odjazdu  
 oraz  szacowany  czas  dojazdu  do  celu  Funkcje  aplikacji:  -  mapa  z  zaznaczoną  pozycją  użytkownika  -  
 wyświetlanie  na  mapie  pojazdów  w  czasie  rzeczywistym  -  informacja  o  opóźnieniu  danej  linii  -  linie  –  
 rozkłady  jazdy  wszystkich  linii  z  podziałem  na  autobusy  oraz  tramwaje  -  przystanki  –  to  samo  co  w  liniach,  
 tylko  ma  dotyczyć  przystanków,  czyli  odjazdy  z  konkretnego  przystanku  -  wyszukiwanie  przystanku  po  jego  nazwie  bądź  numerze  -  
 wyznaczanie  trasy  (skąd;  dokąd;  określenie  czasu  i  czy  dotyczy  on  przyjazdy  czy  odjazdu  do  danego  miejsca,  
 opcje  dodatkowe  jak  wyświetlanie  tylko  pojazdów  niskopodłogowych)  -  ulubione  linie  oraz  przystanki  -  ustawienia  
 (język,  kolorystyka,  wyłączenie  reklam,  ocena  aplikacji,  twórcy,  kontakt  (zgłaszanie  błędów,  kontakt  biznesowy),  regulamindanym   aplikacji) 
 -  system  logowania  się  oraz  rejestracji  (konto  potrzebne  do  wyłączenia  reklam)  