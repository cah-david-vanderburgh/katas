using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace VendingMachineTest
{
    [TestClass]
    public class VendingMachineTests
    {
        private VendingMachine.VendingMachine vendingMachine;

        [TestInitialize]
        public void Setup() {
            vendingMachine = new VendingMachine.VendingMachine();
        }

        [TestMethod]
        public void insertNickelTest() {
            int expectedNumberOfCoins = 1;
            vendingMachine.insertCoin("nickel");
            Assert.AreEqual(expectedNumberOfCoins, vendingMachine.getNumberOfNickels());
        }

        [TestMethod]
        public void insertDimeTest() {

        }

        [TestMethod]
        public void insertQuarterTest() {

        } 
    }
}