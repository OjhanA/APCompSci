/**
 * A class for all 50 states' + DC's demographics and electoral votes
 * @author Jacob
 * @version 2/24
 */

public class FiftyStates {
    private State[] states = new State[51];
    
    public FiftyStates () {
        states[0] = new State ("Alabama", "Yellowhammer State", 4780127, 34, 35, 59, 9);
        states[1] = new State ("Alaska", "The Last Frontier", 710249, 57, 42, 66, 3);
        states[2] = new State ("Arizona", "Grand Canyon State", 6392307, 39, 49, 90, 11);
        states[3] = new State ("Arkansas", "The Natural State", 2915958, 38, 26, 56, 6);
        states[4] = new State ("California", "Golden State", 37254503, 46, 61, 95, 55);
        states[5] = new State ("Colorado", "Centennial State", 5029324, 63, 31, 86, 9);
        states[6] = new State ("Connecticut", "Constitution State", 3574118, 65, 30, 88, 7);
        states[7] = new State ("Delaware", "Diamond State", 897936, 67, 37, 83, 3);
        states[8] = new State ("Florida", "Sunshine State", 18804623, 34, 46, 91, 29);
        states[9] = new State ("Georgia", "Peach State", 9688681, 35, 48, 75, 16);
        states[10] = new State ("Hawaii", "Aloha State", 1360301, 59, 81, 92, 4);
        states[11] = new State ("Idaho", "Gem State", 1567652, 45, 16, 71, 4);
        states[12] = new State ("Illinois", "Prairie State", 12831549, 51, 37, 89, 20);
        states[13] = new State ("Indiana", "Hoosier State", 6484229, 43, 20, 72, 11);
        states[14] = new State ("Iowa", "Hawkeye State", 3046869, 68, 15, 64, 6);
        states[15] = new State ("Kansas", "Sunflower State", 2853132, 62, 25, 74, 6);
        states[16] = new State ("Kentucky", "Bluegrass State", 4339349, 34, 15, 58, 8);
        states[17] = new State ("Louisiana", "Pelican State", 4533479, 34, 42, 73, 8);
        states[18] = new State ("Maine", "Pine Tree State", 1328361, 42, 9, 39, 4);
        states[19] = new State ("Maryland", "Free State", 5773785, 78, 50, 87, 10);
        states[20] = new State ("Massachusetts", "Bay State", 6547817, 80, 27, 92, 11);
        states[21] = new State ("Michigan", "Wolverine State", 9884129, 41, 24, 75, 16);
        states[22] = new State ("Minnesota", "North Star State", 5303925, 74, 18, 73, 10);
        states[23] = new State ("Mississippi", "Magnolia State", 2968103, 34, 44, 49, 6);
        states[24] = new State ("Missouri", "Show-me State", 5988927, 44, 20, 70, 10);
        states[25] = new State ("Montana", "Treasure State", 989417, 40, 10, 56, 3);
        states[26] = new State ("Nebraska", "Cornhusker State", 1826341, 66, 21, 73, 5);
        states[27] = new State ("Nevada", "Silver State", 2700691, 34, 50, 94, 6);
        states[28] = new State ("New Hampshire", "Granite State", 1316466, 70, 9, 60, 4);
        states[29] = new State ("New Jersey", "Garden State", 8791936, 61, 44, 95, 14);
        states[30] = new State ("New Mexico", "Land of Enchantment", 2059192, 37, 62, 77, 5);
        states[31] = new State ("New York", "Empire State", 19378087, 52, 42, 88, 29);
        states[32] = new State ("North Carolina", "Tar Heel State", 9535692, 34, 38, 66, 15);
        states[33] = new State ("North Dakota", "Sioux State", 672591, 76, 15, 60, 3);
        states[34] = new State ("Ohio", "Buckeye State", 11536725, 48, 21, 78, 18);
        states[35] = new State ("Oklahoma", "Sooner State", 3751616, 49, 35, 66, 7);
        states[36] = new State ("Oregon", "Beaver State", 3831073, 54, 26, 81, 7);
        states[37] = new State ("Pennsylvania", "Keystone State", 12702887, 55, 24, 79, 20);
        states[38] = new State ("Rhode Island", "The Ocean State", 1052931, 50, 28, 91, 4);
        states[39] = new State ("South Carolina", "Palmetto State", 4625401, 34, 17, 66, 9);
        states[40] = new State ("South Dakota", "Mount Rushmore State", 814191, 64, 17, 57, 3);
        states[41] = new State ("Tennessee", "Volunteer State", 6346275, 34, 27, 66, 11);
        states[42] = new State ("Texas", "Lone Star State", 25146105, 47, 56, 85, 38);
        states[43] = new State ("Utah", "Beehive State", 2763888, 72, 19, 91, 6);
        states[44] = new State ("Vermont", "Green Mountain State", 625745, 56, 6, 39, 3);
        states[45] = new State ("Virginia", "The Old Dominion", 8001045, 69, 38, 76, 13);
        states[46] = new State ("Washington", "Evergreen State", 6724543, 53, 31, 84, 12);
        states[47] = new State ("West Virginia", "Mountain State", 1853011, 34, 7, 49, 5);
        states[48] = new State ("Wisconsin", "Badger State", 5687289, 60, 22, 70, 10);
        states[49] = new State ("Wyoming", "Equality State", 563767, 58, 15, 65, 3);
        
        states[50] = new State ("Washington, D.C.", "United State Capital", 601767, 50, 63, 100, 3);
                
    }
    
    public State getRandomState () {
        return states[(int) (Math.random() * 50)];
    }
    
    public State getState (int index) {
        return states[index];
    }
}