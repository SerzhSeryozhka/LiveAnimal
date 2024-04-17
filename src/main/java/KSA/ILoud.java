package KSA;

public interface ILoud {
        String l=" Шум проганяет живность. ";
        public default void loud(){
                System.out.println("Громкий звук! "+l);
        }
}
