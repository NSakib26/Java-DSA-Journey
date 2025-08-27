
            pow++;
            bin_num=bin_num/10;
        }
        System.out.println("Decimal of "+myNum +"is: "+ decimal);
    }
    public static void main(String[] args) {
        System.out.print("Enter a Binary number : ");
        Scanner Sc =new Scanner(System.in);
        int b = Sc.nextInt();
        binToDeci(b);

    }
}