package homework21;

public enum Kyndor implements AutoCloseable{

    ДУЙШОМБУ,
    ШЕЙШЕМБИ,
    ШАРШЕМБИ,
    БЕЙШЕМБИ,
    ЖУМА,
    ИШЕНБИ,
    ЖЕКШЕМБИ;


    @Override
    public void close() throws Exception {
        System.out.println("Сиз программадан чыктыныз");
    }
}
