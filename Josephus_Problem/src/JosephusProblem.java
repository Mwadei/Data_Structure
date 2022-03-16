/**
 * Created by M.wadei on 14/02/2022.
 */
public class JosephusProblem<E> extends CircularLinkedList<E> {
    int countOff;


    public JosephusProblem(int playersNo, int countOff) {
        this.countOff = countOff;

        for (int i = 1; i <= playersNo; i++) {

            this.addNode(i);
        }
    }


    public void problemSolution() {
        while (size != 1) {
            for (int i = 0; i <= countOff; i++) {
                this.rotate();
            }
            this.delete();
        }

    }
}
