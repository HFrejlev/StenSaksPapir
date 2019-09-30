public class SSP {



        /** Hvis den første hånd vinder, returneres 1
         *  Hvis den anden hånd vinder, returneres 2
         *  Hvis uafgjort, returneres 0
         *  Hvis det er en fejl, returnerer den -1*/

        int slaa(Haand a, Haand b) {

            int resultat = -1;

            //Første hånd sten
            if (a== Haand.STEN) {
                //anden hånd b kan være sten
                if (b== Haand.STEN) { resultat = 0; }
                //anden hånd b kan være sals
                if (b== Haand.SAKS) { resultat = 1; }
                //anden hånd b kan være papir
                if (b== Haand.PAPIR) { resultat = 2; }
            }

            //Første hånd saks
            if (a== Haand.SAKS) {
                //anden hånd b kan være sten
                if (b== Haand.STEN) { resultat = 2; }
                //anden hånd b kan være sals
                if (b== Haand.SAKS) { resultat = 0; }
                //anden hånd b kan være papir
                if (b== Haand.PAPIR) { resultat = 1; }
            }

            //Første hånd papir
            if (a== Haand.PAPIR) {
                //anden hånd b kan være sten
                if (b== Haand.STEN) { resultat = 1; }
                //anden hånd b kan være sals
                if (b== Haand.SAKS) { resultat = 2; }
                //anden hånd b kan være papir
                if (b== Haand.PAPIR) { resultat = 0; }
            }

            return resultat;

        }


    // TODO flereKampe() {}
}
