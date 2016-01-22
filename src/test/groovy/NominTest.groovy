import com.example.NominTestApplication
import com.example.domain.Institution
import com.okta.scim.util.model.SCIMGroup
import org.junit.Test
import org.junit.runner.RunWith
import org.nomin.NominMapper
import org.nomin.context.SpringContext
import org.nomin.core.Nomin
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(NominTestApplication.class)
class NominTest {
    @Autowired
    ApplicationContext appCtx

    @Test
    void testNomin() {
        NominMapper mapper = new Nomin('Inst2SCIM.groovy')

        Institution institution = new Institution()
        institution.name = 'name'
        institution.displayName = 'displayName'

        def scimGrp = mapper.map(institution, SCIMGroup.class, new SpringContext(appCtx))

        assert scimGrp.id == institution.name
        assert scimGrp.displayName == institution.displayName

        assert scimGrp.members
        assert scimGrp.members[0].id == 'member1'
        assert scimGrp.members[0].displayName == 'Member Number 1'
    }
}
