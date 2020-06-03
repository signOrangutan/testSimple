import future.mybatis.simple.model.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CountryMapperTest extends BaseMapperTest {

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSqlSession();
        try {
            List<Country> countryList = sqlSession.selectList("future.mybatis.simple.mapper.CountryMapper.selectAll");
            printCountryList(countryList);
        } finally {
            sqlSession.close();
        }

    }

    public void printCountryList(List<Country> countryList) {
        for (Country country: countryList) {
            System.out.printf("%-4d%s%s\n", country.getId(), country.getCountryname(), country.getCountrycode());
        }
    }
}
