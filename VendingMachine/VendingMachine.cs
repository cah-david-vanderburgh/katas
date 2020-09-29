using System;

namespace VendingMachine
{
    public class VendingMachine
    {
        private int numberOfNickels = 0;
        private int numberOfDimes = 0;
        private int numberOfQuarters = 0;

        public int getNumberOfNickels() {
            return this.numberOfNickels;
        }

        public int getNumberOfDimes() {
            return this.numberOfDimes;
        }

        public int getNumberOfQuarters() {
            return this.numberOfQuarters;
        }
        public void insertCoin(string coinType) {
            if (coinType.Equals("nickel")) {
                numberOfNickels++;
            } 
        }
        
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
        }
    }
}
