package inject.complex;

public class UserServiceImpl implements UserService {
    private UserDao dao;
    private String xxx;

    //    public UserServiceImpl(UserDaoImpl userDao){
//        this.dao = userDao;
//    }


    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public String getXxx() {
        return xxx;
    }

    public void setXxx(String xxx) {
        this.xxx = xxx;
    }



    public void insert() {
        System.out.println("insert----");
    }
}
