package com.gyh.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.gyh.dto.UserDto;
@Path("user")
//接收JSON格式的数据,REST框架会自动将JSON数据反序列化为对象
@Consumes({MediaType.APPLICATION_JSON,ContentType.APPLICATION_JSON_UTF_8})
//指定输出JSON格式的数据和utf8的编码格式,REST框架会自动将对象序列化为JSON数据
@Produces({MediaType.APPLICATION_JSON,ContentType.APPLICATION_JSON_UTF_8})
public interface UserService {
	@GET
	@Path("getUsers")
	public List<UserDto> getUsers()	;
	
	@GET
	@Path("getUserById/{id}")
	public UserDto getUserById(@PathParam("id")Long id,@Context HttpServletRequest request)	;
	
	@POST
	@Path("register")
	public UserDto registUser(UserDto user);
}
