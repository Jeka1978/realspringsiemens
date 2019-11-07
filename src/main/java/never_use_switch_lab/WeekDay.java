package never_use_switch_lab;

/**
 * @author Evgeny Borisov
 */
public enum WeekDay {


    SUNDAY{
        @Override
        public void work() {

        }
    },MONDAY{
        @Override
        public void work() {

        }
    };

    public abstract void work();
}
