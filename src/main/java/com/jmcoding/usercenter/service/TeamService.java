package com.jmcoding.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jmcoding.usercenter.model.VO.TeamUserVO;
import com.jmcoding.usercenter.model.domain.Team;
import com.jmcoding.usercenter.model.domain.User;
import com.jmcoding.usercenter.model.dto.TeamQuery;
import com.jmcoding.usercenter.model.request.TeamUpdateRequest;

import java.util.List;

/**
 * @author jiumu
 */
public interface TeamService extends IService<Team> {
    /**
     * 添加队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 查询队伍
     *
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 修改队伍
     *
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);
}
