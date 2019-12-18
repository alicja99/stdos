package stdos.Interface;

class Help {
    static void help() {
        System.out.println("  _____________________________________HELP_______________________________________________________________________________________");
        /*interfejs*/
        System.out.println("  exit                                                        - konczy dzialanie systemu");
        System.out.println("  help                                                        - wyswietla pomoc");
        /*interfejs*/

        /*pamięc ram*/
        System.out.println("  _____________________________________PAMIĘĆ RAM_________________________________________________________________________________");
        System.out.println("  ram                                                         - wypisuje zawartość ramu w zapisie heksadecymalnym");
        System.out.println("  ram_part                                                    - wypisuje podzial pamieci ram");
        /*pamięc ram*/

        /* pamięc wirtualna*/
        System.out.println("  _____________________________________PAMIĘĆ WIRTUALNA___________________________________________________________________________");
        System.out.println("  erasevm                                                     - czysci segmenty pamieci wirtualnej");
        System.out.println("  dvm                                                         - wyswietla aktualna zawartosc pamieci wirtualnej");
        /* pamięc wirtualna*/


        System.out.println("  _____________________________________SEMAFOR_____________________________________________________________________________________");
        /* semafor*/
        System.out.println("  semstate [nazwa_pliku]                                      - wyswietla obecny stan semafora");
        System.out.println("  queue    [nazwa_pliku]                                      - wyswietla kolejke semafora");
        /* semafor*/

        System.out.println("  _____________________________________PROCESOR____________________________________________________________________________________");
        /* zarządzanie procesami: semafor, pamiec ram, pamiec wirtualna*/
        System.out.println("  taskcreate [nazwa_pliku] [nazwa_procesu} {priorytet}        - tworzenie procesu");
        System.out.println("  kill [nazwa_procesu]                                        - zakonczenie dzialania danego procesu");
        System.out.println("  tasklist                                                    - wyswietla liste wszystkich procesow");
        System.out.println("  rtasklist                                                   - wyswietla liste gotowych procesow");
        /* zarządzanie procesami*/

        /* procesor*/
        System.out.println("  task_exec                                                   - wyswietla wykonywany proces");
        System.out.println("  prior_tasklist                                              - wyswietla liste gotowych procesow i ich chwilowy priorytet");
        /* procesor*/

        /*zarządzanie plikami i katalogami*/
        System.out.println("  _____________________________________PLIKI I KATALOGI____________________________________________________________________________");
        /*zarządzanie plikami i katalogami*/
        System.out.println("  mkfile [nazwa_pliku]                                        - utworzenie pliku");
        System.out.println("  opnfile [nazwa_pliku]                                       - pobranie zawartosci pliku");
        System.out.println("  dir                                                         - wyswietla wszystkie pliki");
        System.out.println("  erase [nazwa_pliku]                                         - usuniecie pliku");
        /*zarządzanie plikami i katalogami*/

        System.out.println(" _____________________________________ASSEMBLER____________________________________________________________________________________");
        /*interpreter*/
        System.out.println("  step                                                        - wykonaj 1 rozkaz assemblera");
        System.out.println("  step [liczba_krokow]                                        - wykonaj n rozkazow assemblera");
        System.out.println("  register                                                    - wyswietla stan rejestrow");
        /*interpreter*/

    }
    static void printLogo() {
        /* dźwięk startu systemu*/
        Sound.startSystem();
        /* logo systemu*/

        System.out.println(" _____    _______   _______      _    _    _______    _____\n" +
                "/ / \\_\\  /_______\\ | |   \\ \\    |_|  |_|  / /   \\ \\  / / \\_\\\n" +
                "\\_\\____     | |    | |    | |             | |   | |  \\_\\____ \n" +
                "__   \\ \\    | |    | |    | |    _    _   | |   | |  __   \\ \\\n" +
                "\\_\\__/_/    |_|    |_|___/_/    |_|  |_|  \\_\\___/_/  \\_\\__/_/ ");
        /* logo systemu*/

        /*wyświetlenie pomocy*/
        System.out.println(" Wpisz help, aby wyswietlic dostepne polecenia");
        /*wyświetlenie pomocy*/

    }


}

