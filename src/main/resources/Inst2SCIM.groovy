import com.example.domain.Institution
import com.okta.scim.util.model.Membership
import com.okta.scim.util.model.SCIMGroup

mappingFor a: Institution, b: SCIMGroup
b.displayName = a.displayName
b.id = a.name

afterAtoB {
    b.members = [new Membership('member1', 'Member Number 1')]
}