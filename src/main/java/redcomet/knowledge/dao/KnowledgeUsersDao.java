package redcomet.knowledge.dao;

import redcomet.di.Container;
import redcomet.di.DI;
import redcomet.di.Instance;
import redcomet.knowledge.dao.gen.GenKnowledgeUsersDao;

/**
 * アクセス可能なユーザ
 */
@DI(instance=Instance.Singleton)
public class KnowledgeUsersDao extends GenKnowledgeUsersDao {

	/** SerialVersion */
	private static final long serialVersionUID = 1L;
	/**
	 * インスタンス取得
	 * AOPに対応
	 * @return インスタンス
	 */
	public static KnowledgeUsersDao get() {
		return Container.getComp(KnowledgeUsersDao.class);
	}
	
	/**
	 * ナレッジIDを指定し、アクセス可能ユーザ情報をクリアする
	 * @param knowledgeId
	 */
	public void deleteOnKnowledgeId(Long knowledgeId) {
		String sql = "DELETE FROM KNOWLEDGE_USERS WHERE KNOWLEDGE_ID = ?";
		super.executeUpdate(sql, knowledgeId);
	}



}