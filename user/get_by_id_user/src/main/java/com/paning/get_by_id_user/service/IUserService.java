package com.paning.get_by_id_user.service;

import com.paning.get_by_id_user.modelDto.ShowUser;

public interface IUserService {
    ShowUser getByIdUser(Long id);
}
