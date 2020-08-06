/* !!!!
 *Ce code fonctionne mais pas pour de longs array. 
 *Sa complexité est trop grande et INGInious me retourne que 20% 
 * !!!!
 */


public class Valley{
    /*
     * Example:
     * [1, 1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, -1, -1]
     * Should return
     * [5, 3]
     */

     public static int[] valley ( int[] array){
        int mount = 0;
        int val = 0;
        int[] tab = new int[2];
        int mount_ind = 0;
        int val_ind = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] == 1){
                if (mount == 0){
                    mount_ind = i;
                }
                mount += 1;
            }
            if (array[i] == -1){
                if (val == 0){
                    val_ind = i;
                }
                val += 1;
            }
            if(mount == val){
                if (mount_ind < val_ind && mount > tab[1]){
                    tab[1] = mount;
                    mount =0;
                }
                if (val_ind < mount_ind && val > tab[0]){
                    tab[0] = val;
                    val = 0;
                }
            }
        }
        return tab;
     }
}
