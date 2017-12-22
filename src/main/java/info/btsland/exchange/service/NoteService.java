package info.btsland.exchange.service;

import info.btsland.exchange.model.Note;

import java.util.List;

/**
 * Created by Administrator on 2017/12/13.
 */
public interface NoteService {
    /**
     * 查询进行中的订单
     * @param dealerId
     * @return
     */
    List<Note> queryAllHavingNote(String dealerId);
    /**
     * 查询进行中的订单
     * @param dealerId
     * @return
     */
    List<Note> queryAllHavingNote(String dealerId,String coin);

    /**
     * 查询已完成订单
     * @param dealerId
     * @return
     */
    List<Note> queryAllClinchNote(String dealerId);

    /**
     * 查询已完成订单
     * @param dealerId
     * @return
     */
    List<Note> queryAllClinchNote(String dealerId,String coin);

    /**
     * 根据流水号查询一条订单
     * @param noteNo
     * @return
     */
    Note queryNote(String noteNo);

    /**
     * 保存或者更新
     * @param note
     * @return
     */
    int saveOrUpdate(Note note);

    /**
     * 根据承兑商查询订单数
     * @param dealerId
     * @return
     */
    int queryNoteCount(String dealerId);

    /**
     * 查询用户完成的交易记录
     * @param account
     * @param coin
     * @return
     */
    List<Note> queryAllClinchNoteByAccount(String account,String coin);
    /**
     * 查询用户进行中的的交易记录
     * @param account
     * @param coin
     * @return
     */
    List<Note> queryAllHavingNoteByAccount(String account,String coin);
}
