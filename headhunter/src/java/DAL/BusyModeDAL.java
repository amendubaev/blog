package DAL;

import java.util.List;
import model.BusyMode;
import org.apache.ibatis.session.SqlSession;

public class BusyModeDAL extends BaseDAL {

    public BusyModeDAL() {
        super();
    }

    public List<BusyMode> selectAll() {
        SqlSession session = sqlSessionFactory.openSession();
        List<BusyMode> busymodes = session.selectList("busymode.selectAll");
        session.close();
        return busymodes;
    }

    public BusyMode selectById(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        BusyMode busymode = session.selectOne("busymode.selectById", id);
        session.close();
        return busymode;
    }

    public int insert(BusyMode busymode) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.insert("busymode.insert", busymode);
        session.commit();
        session.close();
        return count;
    }

    public int update(BusyMode busymode) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.update("busymode.update", busymode);
        session.commit();
        session.close();
        return count;
    }

    public int delete(BusyMode busymode) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.delete("busymode.delete", busymode);
        session.commit();
        session.close();
        return count;
    }
}
