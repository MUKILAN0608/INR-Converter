import java.util.Scanner;
class Converter {

    void display() {


        System.out.println("\nUnlocking Global Opportunities, One Currency at a Time.\r\n");

    }
}
class Indian extends Converter{
    double inrr;
    void MAL(){
        double inrr;

        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Malaysian Ringgit you need to convert:");
        inrr = sc.nextDouble();

        double myr;
        double MYR = 0;

        myr = 17.59;
        System.out.println("The current price of Malaysian Ringgit to Indian Rupees is: "+"\u20B9"+ myr );

        MYR = myr * inrr;
        System.out.println("THE VALUE OF ENTERED Malaysian Ringgit TO Indian Rupees: " + "\u20B9" + MYR);


    }
    void SING(){
        double inrr;


        super.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of Singapore Dollar you need to convert:");
        inrr= sc.nextDouble();
        super.display();
        double sgd;
        double SGD;
        sgd=61.89;
        System.out.println("The current  price of  Singapore Dollar to Indian Rupees is:"+"\u20B9"+sgd);
        SGD=sgd*inrr;
        System.out.println("THE VALUE OF ENTERED Singapore Dollar TO Indian Rupees :"+"\u20B9"+SGD);

    }
    void JAP(){
        double inrr;


        super.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of Japanese Yen you need to convert:");
        inrr= sc.nextDouble();
        double jpy;
        double JPY;
        jpy=0.549;
        System.out.println("The current  price of  Japanese Yen to Indian Rupees is:"+"\u20B9"+jpy);
        JPY=jpy*inrr;
        System.out.println("THE VALUE OF ENTERED Japanese Yen TO Indian Rupees:"+"\u20B9"+JPY);

    }
    void BAN(){
        super.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of Bangaleshesi Taka you need to convert:");
        inrr= sc.nextDouble();
        double bdt;
        double BDT;
        bdt=0.75;
        System.out.println("The current  price of Bangaleshesi Taka to Indian Rupees is:"+"\u20B9"+bdt);
        BDT=bdt*inrr;
        System.out.println("THE VALUE OF ENTERED Bangaleshesi Taka TO Indian Rupees:"+"\u20B9"+BDT);

    }
    void CHIN() {
        super.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of Chinese Yuan you need to convert:");
        inrr= sc.nextDouble();
        double cny;
        double CNY;
        cny=11.53;
        System.out.println("The current  price of Chinese Yuan to Indian Rupees is:"+"\u20B9"+cny);
        CNY=cny*inrr;
        System.out.println("THE VALUE OF ENTERED Chinese Yuan TO  Indian Rupees:"+"\u20B9"+CNY);

    }
    void HK(){
        super.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of  Hong Kong Dollar you need to convert:");
        inrr= sc.nextDouble();
        double hdk;
        double HDK;
        hdk=10.65;
        System.out.println("The current  price of Hong Kong Dollar to Indian Rupees is:"+"\u20B9"+hdk);
        HDK=hdk*inrr;
        System.out.println("THE VALUE OF ENTERED  Hong Kong Dollar  TO  Indian Rupees:"+"\u20B9"+HDK);

    }
    void IR(){
        super.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of  Indonasian Rupiah you need to convert:");
        inrr= sc.nextDouble();
        double idr;
        double IDR;
        idr=0.00525;
        System.out.println("The current  price of Indonasian Rupiah to Indian Rupees is:"+"\u20B9"+idr);
        IDR=idr*inrr;
        System.out.println("THE VALUE OF ENTERED Indonasian Rupiah Indian Rupees TO Indian Rupees:"+"\u20B9"+IDR);
    }
    void CMB(){
        super.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of  Cambodian Riel  you need to convert:");
        inrr= sc.nextDouble();
        double khr;
        double KHR;
        khr=0.020;
        System.out.println("The current  price of Cambodian Riel to Indian Rupees is:"+"\u20B9"+khr);
        KHR=khr*inrr;
        System.out.println("THE VALUE OF ENTERED Cambodian Riel TO Indian Rupees:"+"\u20B9"+KHR);
    }
    void SK(){
        super.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of  South Korean Won you need to convert:");
        inrr= sc.nextDouble();
        double krw;
        double KRW;
        krw=0.061;
        System.out.println("The current  price of South Korean Won to Indian Rupees is:"+"\u20B9"+krw);
        KRW=krw*inrr;
        System.out.println("THE VALUE OF ENTERED  South Korean Won TO Indian Rupees:"+"\u20B9"+KRW);
    }
    void LK(){
        super.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of  Lao Kip you need to convert:");
        inrr= sc.nextDouble();
        double lak;
        double LAK;
        lak=0.0039;
        System.out.println("The current  price of Lao Kip to Indian Rupees is:"+"\u20B9"+lak);
        LAK=lak*inrr;
        System.out.println("THE VALUE OF ENTERED Lao Kip TO Indian Rupees:"+"\u20B9"+LAK);

    }
    void SL(){
        super.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of Sri Lankan Rupee you need to convert:");
        inrr= sc.nextDouble();
        double lkr;
        double LKR=0;
        lkr=0.278;
        System.out.println("The current  price of Sri Lankan Rupee to Indian Rupees is:"+"\u20B9"+lkr);
        LKR=lkr*inrr;
        System.out.println("THE VALUE OF ENTERED Sri Lankan Rupee  TO Indian Rupees:"+"\u20B9"+LKR);
    }
    void MR() {
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Maldivian Rufiyaa you need to convert:");
        inrr = sc.nextDouble();
        double mvr;
        double MVR = 0;
        mvr = 5.39;
        System.out.println("The current  price of Maldivian Rufiyaa to Indian Rupees is:"+"\u20B9"+mvr);
        MVR = mvr * inrr;
        System.out.println("THE VALUE OF ENTERED Maldivian Rufiyaa TO Indian Rupees:"+"\u20B9"+MVR);
    }
        void NR(){
            super.display();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount of Nepalese Rupee you need to convert:");
            inrr = sc.nextDouble();
            double npr;
            double NPR=0;
            npr=0.624;
            System.out.println("The current  price of Nepalese Rupee to Indian Rupees is:"+"\u20B9"+npr);
            NPR=npr*inrr;
            System.out.println("THE VALUE OF ENTERED Nepalese Rupee TO Indian Rupees:"+"\u20B9"+NPR);
        }
        void PP(){
            super.display();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount of Philippine Peso you need to convert:");
            inrr = sc.nextDouble();
            double php;
            double PHP=0;
            php=1.477;
            System.out.println("The current  price of Philippine Peso to Indian Rupees is:"+"\u20B9"+php);
            PHP=php*inrr;
            System.out.println("THE VALUE OF ENTERED Philippine Peso TO  Indian Rupees:"+"\u20B9"+PHP);
        }
        void PR(){
        super.display();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount of Pakistani Rupee you need to convert:");
            inrr = sc.nextDouble();
            double pkr;
            double PKR=0;
            pkr=0.300;
            System.out.println("The current  price of Pakistani Rupee to Indian Rupees is:"+"\u20B9"+pkr);
            PKR=pkr*inrr;
            System.out.println("THE VALUE OF ENTERED Pakistani Rupee TO Indian Rupees:"+"\u20B9"+PKR);
        }
        void Tahi (){
            super.display();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount of Thai Baht you need to convert:");
            inrr = sc.nextDouble();
            double thb;
            double THB=0;
            thb=2.27;
            System.out.println("The current  price of Thai Baht to Indian Rupees is:"+"\u20B9"+thb);
            THB=thb*inrr;
            System.out.println("THE VALUE OF ENTERED Thai Baht TO Indian Rupees:"+"\u20B9"+THB);
        }
        void taiwan(){
            super.display();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount of Taiwanese Dollar you need to convert:");
            inrr = sc.nextDouble();
            double twd;
            double TWD=0;
            twd=2.60;
            System.out.println("The current  price of Taiwanese Dollar to Indian Rupees is:"+"\u20B9"+twd);
            TWD=twd*inrr;
            System.out.println("THE VALUE OF ENTERED Taiwanese Dollar TO Indian Rupees:"+"\u20B9"+TWD);
        }
        void veit(){
            super.display();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount of  Veitnamese Dong you need to convert:");
            inrr = sc.nextDouble();
            double vnd;
            double VND=0;
            vnd=0.0033;
            System.out.println("The current  price of Veitnamese Dong to Indian Rupees is:"+"\u20B9"+vnd);
            VND=vnd*inrr;
            System.out.println("THE VALUE OF ENTERED  Veitnamese Dong TO Indian Rupees:"+"\u20B9"+VND);
        }
      void Euro(){
          super.display();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the amount of Euro you need to convert:");
          inrr = sc.nextDouble();
          double ero;
          double ERO=0;
          ero=90.53;
          System.out.println("The current  price of Euro to Indian Rupees is:"+"\u20B9"+ero);
          ERO=ero*inrr;
          System.out.println("THE VALUE OF ENTERED Euro TO Indian Rupees:"+"\u20B9"+ERO);

      }
      void bfs(){
          super.display();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the amount of British Pound Sterling you need to convert:");
          inrr = sc.nextDouble();
          double ero;
          double ERO=0;
          ero=105.56;
          System.out.println("The current  price of British Pound Sterling to Indian Rupees is:"+"\u20B9"+ero);
          ERO=ero*inrr;
          System.out.println("THE VALUE OF ENTERED British Pound Sterling TO Indian Rupees:"+"\u20B9"+ERO);

      }
      void Bam(){
          super.display();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the amount of Bosnia and Herzegovina convertible mark you need to convert:");
          inrr = sc.nextDouble();
          double ero;
          double ERO=0;
          ero=45.82;
          System.out.println("The current  price of Bosnia and Herzegovina convertible mark to Indian Rupees is:"+"\u20B9"+ero);
          ERO=ero*inrr;
          System.out.println("THE VALUE OF ENTERED Bosnia and Herzegovina convertible mark TO Indian Rupees:"+"\u20B9"+ERO);
      }
       void bl(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Bulgarian Lev you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=46.28;
           System.out.println("The current  price of Bulgarian Lev to Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Bulgarian Lev TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void ck(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Czech Koruna you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=3.57;
           System.out.println("The current  price of Czech Koruna T0 Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Czech Koruna TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void dk(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Danish Krone you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=12.135;
           System.out.println("The current  price of Danish Krone To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Danish KroneTO Indian Rupees:"+"\u20B9"+ERO);
       }
       void crk(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Croatian Kuna you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=11.884;
           System.out.println("The current  price of Croatian Kuna To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Croatian Kuna TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void HF(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Hungarian Forint you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=0.231;
           System.out.println("The current  price of Hungarian Forint To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Hungarian Forint TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void ICK(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Icelandic Krona you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=0.602;
           System.out.println("The current  price of Icelandic Krona To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Icelandic Krona TO Indian Rupees:"+"\u20B9"+ERO);


       }
       void mol(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Moldovan Leu you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=4.720;
           System.out.println("The current  price of Moldovan Leu To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Moldovan Leu TO Indian Rupees:"+"\u20B9"+ERO);

       }
       void Mkd(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Macedonian Denar you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=1.459;
           System.out.println("The current  price of Macedonian Denar To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Macedonian Denar TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void nok(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Norwegian Krone you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=7.797;
           System.out.println("The current  price of Norwegian Krone To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Norwegian Krone TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void sf(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Swiss Franc you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=94.28;
           System.out.println("The current  price of Swiss Franc To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Norwegian Krone TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void pz(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Polish Zloty you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=21.07;
           System.out.println("The current  price of Polish Zloty To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Polish Zloty TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void rol(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Romanian Leu you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=18.21;
           System.out.println("The current  price of Romanian Leu To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Romanian Leu TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void serb(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Serbian Dinar you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=0.77;
           System.out.println("The current  price of Serbian Dinar To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Serbian Dinar TO Indian Rupees:"+"\u20B9"+ERO);

       }
       void Rushro(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Russian Rouble you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=0.90;
           System.out.println("The current  price of Russian Rouble To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Russian Rouble TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void Sewdish(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Swedish Krona you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=7.86;
           System.out.println("The current  price of Swedish Krona To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Swedish Krona TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void turkish(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Turkish Lira you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=2.61;
           System.out.println("The current  price of Turkish Lira To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Turkish Lira TO Indian Rupees:"+"\u20B9"+ERO);
       }
       void ukraine(){
           super.display();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the amount of Ukraine Hryvnia you need to convert:");
           inrr = sc.nextDouble();
           double ero;
           double ERO=0;
           ero=2.13;
           System.out.println("The current  price of Ukraine Hryvnia To Indian Rupees is:"+"\u20B9"+ero);
           ERO=ero*inrr;
           System.out.println("THE VALUE OF ENTERED Ukraine Hryvnia TO Indian Rupees:"+"\u20B9"+ERO);
       }
  void UAE()  {
      super.display();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the amount of United Arab Emirates Dirham you need to convert:");
      inrr = sc.nextDouble();
      double ero;
      double ERO=0;
      ero=22.5;
      System.out.println("The current  price of United Arab Emirates Dirham To Indian Rupees is:"+"\u20B9"+ero);
      ERO=ero*inrr;
      System.out.println("THE VALUE OF ENTERED United Arab Emirates Dirham TO Indian Rupees:"+"\u20B9"+ERO);


    }
    void sr(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Saudi Riyal you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=22.1;
        System.out.println("The current  price of Saudi Riyal To Indian Rupees is:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Saudi Riyal TO Indian Rupees:"+"\u20B9"+ERO);

    }
    void or(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Omani Rial you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=215.3;
        System.out.println("The current  price of Omani Rial To Indian Rupees is:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Omani Rial TO Indian Rupees:"+"\u20B9"+ERO);

    }
    void bhd(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Bahraini Dinar you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=219.9;
        System.out.println("The current  price of Bahraini Dinar To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Bahraini Dinar TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void kwd(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Kuwaiti Dinar you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=269.6;
        System.out.println("The current  price of Kuwaiti Dinar To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Kuwaiti Dinar TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void oar(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Qatari Riyal you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=22.7;
        System.out.println("The current  price of Qatari Riyal To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Qatari Riyal TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void isr(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Israeli Sheqel you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=22.67;
        System.out.println("The current  price of Israeli Sheqel To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Israeli Sheqel TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void irri(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Iranian Rial you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=0.0019;
        System.out.println("The current  price of Iranian Rial To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Iranian Rial TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void jor(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Jordanian Dinar you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=117.0;
        System.out.println("The current  price of Jordanian Dinar To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Jordanian Dinar TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void lp(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Lebanese Pound you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=0.0009;
        System.out.println("The current  price of Lebanese Pound To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Lebanese Pound TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void syp(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Syrian Pound you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=0.0063;
        System.out.println("The current  price of Syrian Pound To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Syrian Pound TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void usd(){

            super.display();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount of United States Dollar you need to convert:");
            inrr = sc.nextDouble();
            double ero;
            double ERO=0;
            ero=82.89;
            System.out.println("The current  price of United States Dollar To  is Indian Rupees:"+"\u20B9"+ero);
            ERO=ero*inrr;
            System.out.println("THE VALUE OF ENTERED United States Dollar TO Indian Rupees:"+"\u20B9"+ERO);
        }
    void cad(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Canadian Dollar you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=61.21;
        System.out.println("The current  price of Canadian Dollar To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Canadian Dollar TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void bmd(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Bermudian Dollar you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=82.89;
        System.out.println("The current  price of Bermudian Dollar To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Bermudian Dollar TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void af(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Aruban Florin you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=45.77;
        System.out.println("The current  price of Aruban Florin To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Aruban Florin TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void bard(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Barbadian Dollar you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=41.03;
        System.out.println("The current  price of Barbadian Dollar To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Barbadian Dollar TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void bahd(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Bahamian Dollar you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=82.88;
        System.out.println("The current  price of Bahamian Dollar To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Bahamian Dollar TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void dope(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Dominican Peso you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=1.39;
        System.out.println("The current  price of Dominican Peso To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Dominican Peso TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void guqu(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Guatemalan Quetzal you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=1.39;
        System.out.println("The current  price of Guatemalan Quetzal To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Guatemalan QuetzalTO Indian Rupees:"+"\u20B9"+ERO);
    }
    void jamd(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Jamaican Dollar you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=0.53;
        System.out.println("The current  price of Jamaican Dollar To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Jamaican Dollar TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void mepo(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Mexican Peso you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=4.69;
        System.out.println("The current  price of Mexican Peso To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Mexican Peso TO Indian Rupees:"+"\u20B9"+ERO);
    }
    void pab(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Panamanian Balboa you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO=0;
        ero=82.88;
        System.out.println("The current  price of Panamanian Balboa To  is Indian Rupees:"+"\u20B9"+ero);
        ERO=ero*inrr;
        System.out.println("THE VALUE OF ENTERED Panamanian Balboa TO Indian Rupees:"+"\u20B9"+ERO);
    }
 void xab(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of East Caribbean Dollar you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=30.58;
     System.out.println("The current  price of East Caribbean Dollar To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED East Caribbean Dollar TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void ad(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Australian Dollar you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=54.38;
     System.out.println("The current  price of Australian Dollar To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Australian Dollar TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void fd(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Fijian Dollar you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=37.13;
     System.out.println("The current  price of Fijian Dollar To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Fijian Dollar TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void nzd(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of New Zealand Dollar you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=50.53;
     System.out.println("The current  price of New Zealand Dollar To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED New Zealand Dollar TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void xpf(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of CFP Franc you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=0.75;
     System.out.println("The current  price of New Zealand Dollar To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED New Zealand Dollar TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void ars(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Argentine Peso you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=0.097;
     System.out.println("The current  price of Argentine Peso To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Argentine Peso TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void bob(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Bolivian Boliviano you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=12.08;
     System.out.println("The current  price of Bolivian Boliviano To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Bolivian Boliviano TO Indian Rupees"+"\u20B9"+ERO);
 }
 void brazr(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Brazilian Real you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=16.58;
     System.out.println("The current  price of Brazilian Real To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Brazilian Real TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void chilp(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Chilean Peso you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=00.088;
     System.out.println("The current  price of Chilean Peso To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Chilean Peso TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void cop(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Colombian Peso you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=00.021;
     System.out.println("The current  price of Colombian Peso To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Colombian Peso TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void pen(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Peruvian Sol you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=22.47;
     System.out.println("The current  price of Peruvian Sol To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Peruvian Sol TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void pyg(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Paraguayan Guaraní you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=0.011;
     System.out.println("The current  price of Paraguayan Guaraní To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Paraguayan Guaraní TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void ttd(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Trinidad and Tobago Dollar you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=12.19;
     System.out.println("The current  price of Trinidad and Tobago Dollar To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Trinidad and Tobago Dollar TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void uyu(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Uruguayan Peso you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=2.15;
     System.out.println("The current  price of Uruguayan Peso To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Uruguayan Peso TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void ves(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Venezuelan Bolívar you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=2.28;
     System.out.println("The current  price of Venezuelan Bolívar To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Venezuelan Bolívar TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void zar(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of South African Rand you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=4.41;
     System.out.println("The current  price of South African Rand To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED South African Rand TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void bwp(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Botswana Pula you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=6.09;
     System.out.println("The current  price of Botswana Pula To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Botswana Pula TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void egp(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Egyptian Pound you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=1.73;
     System.out.println("The current  price of Egyptian Pound To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Egyptian Pound TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void ghs(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Ghana Cedi you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=6.42;
     System.out.println("The current  price of Ghana Cedi To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Ghana Cedi TO Indian Rupees:"+"\u20B9"+ERO);
 }
 void gmd(){
     super.display();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount of Gambian Dalasi you need to convert:");
     inrr = sc.nextDouble();
     double ero;
     double ERO=0;
     ero=1.21;
     System.out.println("The current  price of Gambian Dalasi To  is Indian Rupees:"+"\u20B9"+ero);
     ERO=ero*inrr;
     System.out.println("THE VALUE OF ENTERED Gambian Dalasi TO Indian Rupees:"+"\u20B9"+ERO);
 }
void kes(){
    super.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of Kenyan Shilling you need to convert:");
    inrr = sc.nextDouble();
    double ero;
    double ERO=0;
    ero=0.60;
    System.out.println("The current  price of Kenyan Shilling To  is Indian Rupees:"+"\u20B9"+ero);
    ERO=ero*inrr;
    System.out.println("THE VALUE OF ENTERED Kenyan Shilling TO Indian Rupees:"+"\u20B9"+ERO);
}
void mad(){
    super.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of Moroccan Dirham you need to convert:");
    inrr = sc.nextDouble();
    double ero;
    double ERO=0;
    ero=8.05;
    System.out.println("The current  price of Moroccan Dirham To  is Indian Rupees:"+"\u20B9"+ero);
    ERO=ero*inrr;
    System.out.println("THE VALUE OF ENTERED Moroccan Dirham TO Indian Rupees:"+"\u20B9"+ERO);
}
void mga(){
    super.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of Malagasy Ariary you need to convert:");
    inrr = sc.nextDouble();
    double ero;
    double ERO=0;
    ero=0.0018;
    System.out.println("The current  price of Malagasy Ariary To  is Indian Rupees:"+"\u20B9"+ero);
    ERO=ero*inrr;
    System.out.println("THE VALUE OF ENTERED Malagasy Ariary TO Indian Rupees:"+"\u20B9"+ERO);
}
void mur(){
    super.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of Mauritian Rupee you need to convert:");
    inrr = sc.nextDouble();
    double ero;
    double ERO=0;
    ero=1.80;
    System.out.println("The current  price of Mauritian Rupee To  is Indian Rupees:"+"\u20B9"+ero);
    ERO=ero*inrr;
    System.out.println("THE VALUE OF ENTERED Mauritian Rupee TO Indian Rupees:"+"\u20B9"+ERO);
}
void nad(){
    super.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of Namibian Dollar you need to convert:");
    inrr = sc.nextDouble();
    double ero;
    double ERO=0;
    ero=4.40;
    System.out.println("The current  price of Namibian Dollar To  is Indian Rupees:"+"\u20B9"+ero);
    ERO=ero*inrr;
    System.out.println("THE VALUE OF ENTERED Namibian Dollar TO Indian Rupees:"+"\u20B9"+ERO);
}
void ngn(){

        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Nigerian Naira you need to convert:");
        inrr = sc.nextDouble();
        double ero;
        double ERO = 0;
        ero = 0.061;
        System.out.println("The current price of Nigerian Naira in Indian Rupees: " + "\u20B9" + ero);
        ERO = ero * inrr;
        System.out.println("THE VALUE OF ENTERED Nigerian Naira TO Indian Rupees:"+"\u20B9"+ ERO);


}
void scr(){
    super.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of Seychellois Rupee you need to convert:");
    inrr = sc.nextDouble();
    double ero;
    double ERO=0;
    ero=6.17;
    System.out.println("The current  price of Seychellois Rupee To  is Indian Rupees:"+" \u20B9"+ero);
    ERO = ero * inrr;
    System.out.println("THE VALUE OF ENTERED Seychellois Rupee TO Indian Rupees:"+"\u20B9"+ERO);
}
void tnd(){
    super.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of Tunisian Dinar you need to convert:");
    inrr = sc.nextDouble();
    double ero;
    double ERO=0;
    ero=26.68;
    System.out.println("The current  price of Tunisian Dinar To  is Indian Rupees:"+"\u20B9"+ero);
    ERO=ero*inrr;
    System.out.println("THE VALUE OF ENTERED Tunisian Dinar TO Indian Rupees:"+"\u20B9"+ERO);
}
void ugx(){
    super.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of Ugandan Shilling you need to convert:");
    inrr = sc.nextDouble();
    double ero;
    double ERO=0;
    ero=0.0021;
    System.out.println("The current  price of Ugandan Shilling To  is Indian Rupees:"+"\u20B9"+ero);
    ERO=ero*inrr;
    System.out.println("THE VALUE OF ENTERED Ugandan Shilling TO Indian Rupees:"+"\u20B9"+ERO);
}
void xaf(){
    super.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of Central African Franc you need to convert:");
    inrr = sc.nextDouble();
    double ero;
    double ERO=0;
    ero=0.137;
    System.out.println("The current  price of Central African Franc To  is Indian Rupees:"+"\u20B9"+ero);
    ERO=ero*inrr;
    System.out.println("THE VALUE OF ENTERED Central African Franc TO Indian Rupees:"+"\u20B9"+ERO);
}
void xof(){
    super.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of West African Franc you need to convert:");
    inrr = sc.nextDouble();
    double ero;
    double ERO=0;
    ero=0.137;
    System.out.println("The current  price of West African Franc To  is Indian Rupees:"+"\u20B9"+ero);
    ERO=ero*inrr;
    System.out.println("THE VALUE OF ENTERED West African Franc TO Indian Rupees:"+"\u20B9"+ERO);
}
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Indian ic = new Indian();

        double inrr = 0;
        System.out.println("CHOOSE THE REGION IN WHICH YOU NEED TO CONVERT: \n");
        System.out.println("1.Asian Currencies\n");
        System.out.println("2.Europian Currencies\n");
        System.out.println("3.Middle Eeastern Currencies\n");
        System.out.println("4.North American Currencies\n");
        System.out.println("5.Oceanian Currencies\n");
        System.out.println("6.South American Currencies\n");
        System.out.println("7.African Currencies\n");
        int v = 0;
        int o = 0;
        int w1 = 0;
        int m = 0;
        int q=0;
        int r=0;
        int c=0;
        int u=0;
        v = sc.nextInt();
        switch (v) {
            case 1:
                System.out.println("CHOSE THE ASIAN COUNTRIES FOR MONEY EXCHANGE:\n");
                System.out.println("1.Malaysian Ringgit\n");
                System.out.println("2.Singapore Dollar\n");
                System.out.println("3.Japanese Yen\n");
                System.out.println("4.Bangaladesi Taka\n");
                System.out.println("5.Chinese Yuan\n");
                System.out.println("6.Hong Kong Dollar\n");
                System.out.println("7.Indonesian Rupiah\n");
                System.out.println("8.Cambodian Riel\n");
                System.out.println("9.South Korean Won\n");
                System.out.println("10.Lao.Kip\n");
                System.out.println("11.Sri Lanka Rupee\n");
                System.out.println("12.Maldivain Rufiyaa\n");
                System.out.println("13.Nepalese Rupee\n");
                System.out.println("14.Philippine Peso\n");
                System.out.println("15.Pakistani Rupee\n");
                System.out.println("16.Thai Baht\n");
                System.out.println("17.Taiwanese Dollar\n");
                System.out.println("18.Veitnamese Dong\n");

                o = sc.nextInt();
                switch (o) {

                    case 1:
                        ic.MAL();
                        break;
                    case 2:
                        ic.SING();
                        break;
                    case 3:
                        ic.JAP();
                        break;
                    case 4:
                        ic.BAN();
                        break;
                    case 5:
                        ic.CHIN();
                        break;
                    case 6:
                        ic.HK();
                        break;
                    case 7:
                        ic.IR();
                        break;
                    case 8:
                        ic.CMB();
                        break;
                    case 9:
                        ic.SK();
                        break;
                    case 10:
                        ic.LK();
                        break;
                    case 11:
                        ic.SL();
                        break;
                    case 12:
                        ic.MR();
                        break;
                    case 13:
                        ic.NR();
                        break;
                    case 14:
                        ic.PP();
                        break;
                    case 15:
                        ic.PR();
                        break;
                    case 16:
                        ic.Tahi();
                        break;
                    case 17:
                        ic.taiwan();
                        break;
                    case 18:
                        ic.veit();
                        break;


                }
                break;
            case 2:
                System.out.println("CHOSE THE EUROPIAN COUNTRIES FOR MONEY EXCHANGE:\n");
                System.out.println("1.Euro\n");
                System.out.println("2.British Pound Sterling\n");
                System.out.println("3.Swiss Franc\n");
                System.out.println("4.Bosnia and Herzegovina convertible mark\n");
                System.out.println("5.Bulgarian Lev\n");
                System.out.println("6.Czech Koruna\n");
                System.out.println("7.Danish Krone\n");
                System.out.println("8.Croatian Kuna\n");
                System.out.println("9.Hungarian Forint\n");
                System.out.println("10.Icelandic Krona\n");
                System.out.println("11.Moldovan Leu\n");
                System.out.println("12.Macedonian Denar\n");
                System.out.println("13.Norwegian Krone\n");
                System.out.println("14.Polish Zloty\n");
                System.out.println("15.Romanian Leu\n");
                System.out.println("16.Serbian Dinar\n");
                System.out.println("17.Russian Rouble\n");
                System.out.println("18.Swedish Krona\n");
                System.out.println("19.Turkish Lira\n");
                System.out.println("20.Ukraine Hryvnia\n");

                w1 = sc.nextInt();
                switch (w1) {
                    case 1: {
                        ic.Euro();
                        break;
                    }
                    case 2: {
                        ic.bfs();
                        break;
                    }
                    case 3: {
                        ic.sf();
                        break;
                    }
                    case 4: {
                        ic.Bam();
                        break;
                    }
                    case 5: {
                        ic.bl();
                        break;
                    }
                    case 6: {
                        ic.ck();
                        break;
                    }
                    case 7: {
                        ic.dk();
                        break;
                    }
                    case 8: {
                        ic.crk();
                        break;
                    }
                    case 9: {
                        ic.HF();
                        break;
                    }
                    case 10: {
                        ic.ICK();
                        break;
                    }
                    case 11: {
                        ic.mol();
                        break;
                    }
                    case 12: {
                        ic.Mkd();
                        break;
                    }
                    case 13: {
                        ic.nok();

                        break;
                    }
                    case 14: {
                        ic.pz();
                        break;
                    }
                    case 15: {
                        ic.rol();
                        break;
                    }
                    case 16: {
                        ic.serb();
                        break;
                    }
                    case 17: {
                        ic.Rushro();
                        break;
                    }
                    case 18: {
                        ic.Sewdish();
                        break;
                    }
                    case 19: {
                        ic.turkish();
                        break;
                    }
                    case 20: {
                        ic.ukraine();
                        break;
                    }

                }
                break;
            case 3: {
                System.out.println("CHOSE THE MIDDLE EASTERN CURRENCIES FOR MONEY EXCHANGE:\n");
                System.out.println("1.United Arab Emirates Dirham\n");
                System.out.println("2.Saudi Riyal\n");
                System.out.println("3.Omani Rial\n");
                System.out.println("4.Bahraini Dinar\n");
                System.out.println("5.Kuwaiti Dinar\n");
                System.out.println("6.Qatari Riyal\n");
                System.out.println("7.Israeli Sheqel\n");
                System.out.println("8.Iranian Rial\n");
                System.out.println("9.Jordanian Dinar\n");
                System.out.println("10.Lebanese Pound\n");
                System.out.println("11.Syrian Pound\n");
                m = sc.nextInt();
                switch (m){
                    case 1:{
                        ic.UAE();
                        break;
                    }
                    case 2:{
                        ic.sr();
                        break;
                    }
                    case 3:{
                        ic.or();
                        break;
                    }
                    case 4:{
                        ic.bhd();
                        break;
                    }
                    case 5:{
                        ic.kwd();
                        break;
                    }
                    case 6:{
                        ic.oar();
                        break;
                    }
                    case 7:{
                        ic.isr();
                        break;
                    }
                    case 8:{
                        ic.irri();
                        break;
                    }
                    case 9:{
                        ic.jor();
                        break;
                    }
                    case 10:{
                        ic.lp();
                        break;
                    }
                    case 11:{
                        ic.syp();
                        break;
                    }

                }


                    }
            break;
            case 4: {
                System.out.println("CHOSE THE NORTH AMERICAN CURRENCIES FOR MONEY EXCHANGE:\n");
                System.out.println("1.United States Dollar\n");
                System.out.println("2.Canadian Dollar\n");
                System.out.println("3.Bermudian Dollar\n");
                System.out.println("4.Aruban Florin\n");
                System.out.println("5.Barbadian Dollar\n");
                System.out.println("6.Bahamian Dollar\n");
                System.out.println("7.Dominican Peso\n\n");
                System.out.println("8.Guatemalan Quetzal\n");
                System.out.println("9.Jamaican Dollar\n");
                System.out.println("10.Mexican Peso\n");
                System.out.println("11.Panamanian Balboa\n");
                System.out.println("12.East Caribbean Dollar\n");

                q= sc.nextInt();
                switch (q) {
                    case 1: {
                        ic.usd();
                     break;
                    }
                    case 2: {
                        ic.cad();
                      break;
                    }
                    case 3:{
                        ic.bmd();
                        break;
                    }
                    case 4:{
                        ic.af();
                        break;
                    }
                    case 5:{
                        ic.bard();
                        break;
                    }
                    case 6:{
                        ic.bahd();
                        break;
                    }
                    case 7:{
                        ic.dope();
                        break;
                    }
                    case 8:{
                        ic.guqu();
                        break;
                    }
                    case 9:{
                        ic.jamd();
                        break;
                    }
                    case 10:{
                        ic.mepo();
                        break;
                    }
                    case 11:{
                        ic.pab();
                        break;
                    }
                    case 12:{
                        ic.xab();
                        break;
                    }
                }
                break;
            }
            case 5:{
                System.out.println("CHOSE THE Oceanian Currencies FOR MONEY EXCHANGE:\n");
                System.out.println("1.Australian Dollar\n");
                System.out.println("2.Fijian Dollar\n");
                System.out.println("3.New Zealand Dollar\n");
                System.out.println("4.CFP Franc\n");
                r= sc.nextInt();
                switch (r){
                    case 1:{
                        ic.ad();
                        break;
                    }
                    case 2:{
                        ic.fd();
                        break;
                    }
                    case 3:{
                        ic.nzd();
                        break;
                    }
                    case 4:{
                        ic.xpf();
                        break;
                    }
                }
                break;
            }
            case 6:{
                System.out.println("CHOSE THE SOUTH AMERICAN CURRENCIES FOR MONEY EXCHANGE:\n");
                System.out.println("1.Argentine Peso\n");
                System.out.println("2.Bolivian Boliviano\n");
                System.out.println("3.Brazilian Real\n");
                System.out.println("4.Chilean Peso\n");
                System.out.println("5.Colombian Peso\n");
                System.out.println("6.Peruvian Sol\n");
                System.out.println("7.Paraguayan Guaraní\n");
                System.out.println("8.Trinidad and Tobago Dollar\n");
                System.out.println("9.Uruguayan Peso\n");
                System.out.println("10.Venezuelan Bolívar\n");
                c= sc.nextInt();
                switch (c){
                    case 1:{
                        ic.ars();
                        break;
                    }
                    case 2:{
                        ic.bob();
                        break;
                    }
                    case 3:{
                    ic.brazr();
                        break;
                    }
                    case 4:{
                        ic.chilp();
                        break;
                    }
                    case 5:{
                        ic.cop();
                        break;
                    }
                    case 6:{
                        ic.pen();
                        break;
                    }
                    case 7:{
                        ic.pyg();
                        break;
                    }
                    case 8:{
                        ic.ttd();
                        break;
                    }
                    case 9:{
                        ic.uyu();
                        break;
                    }
                    case 10:{
                        ic.ves();
                        break;
                    }
                }
                break;
            }
            case 7:{
                System.out.println("CHOSE THE AFRICAN CURRENCIES FOR MONEY EXCHANGE:\n");
                System.out.println("1.South African Rand\n");
                System.out.println("2.Botswana Pula\n");
                System.out.println("3.Egyptian Pound\n");
                System.out.println("4.Ghana Cedi\n");
                System.out.println("5.Gambian Dalasi\n");
                System.out.println("6.Kenyan Shilling\n");
                System.out.println("7.Moroccan Dirham\n");
                System.out.println("8.Malagasy Ariary\n");
                System.out.println("9.Mauritian Rupee\n");
                System.out.println("10.Namibian Dollar\n");
                System.out.println("11.Nigerian Naira\n");
                System.out.println("12.Seychellois Rupee\n");
                System.out.println("13.Tunisian Dinar\n");
                System.out.println("14.Ugandan Shilling\n");
                System.out.println("15.Central African Franc\n");
                System.out.println("16.West African Franc\n");
                u= sc.nextInt();
                switch (u){
                    case 1:{
                     ic.zar();
                     break;
                    }
                    case 2:{
                        ic.bwp();
                        break;
                    }
                    case 3:{
                        ic.egp();
                        break;
                    }
                    case 4:{
                        ic.ghs();
                        break;
                    }
                    case 5:{
                        ic.gmd();
                        break;
                    }
                    case 6:{
                        ic.kes();
                        break;
                    }
                    case 7:{
                        ic.mad();
                        break;
                    }
                    case 8:{
                        ic.mga();
                        break;
                    }
                    case 9:{
                        ic.mur();
                        break;
                    }
                    case 10:{
                        ic.nad();
                        break;
                    }
                    case 11:{
                        ic.ngn();
                        break;
                    }
                    case 12:{
                        ic.scr();
                        break;
                    }
                    case 13:{
                        ic.tnd();
                        break;
                    }
                    case 14:{
                        ic.ugx();
                        break;
                    }
                    case 15:{
                        ic.xaf();
                        break;
                    }
                    case 16:{
                       ic.xof();
                          break;
                    }

                }
            }
                }

            }

        }

