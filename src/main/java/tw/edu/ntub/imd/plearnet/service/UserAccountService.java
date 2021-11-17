package tw.edu.ntub.imd.plearnet.service;

import tw.edu.ntub.imd.plearnet.bean.UserAccountBean;

import java.util.Optional;

public interface UserAccountService extends BaseService<UserAccountBean, Integer> {
    public void update(Integer id, UserAccountBean userAccountBean);
    public Optional<UserAccountBean> getById(Integer id);
}
