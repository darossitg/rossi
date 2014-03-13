package com.targettrust.imob.rn;

import com.targettrust.imob.bean.ClienteBean;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.apache.log4j.Logger;

public class ClienteRN {

    private static final Logger logger = Logger.getLogger(ClienteRN.class);
    private EntityManager em;

    public ClienteRN() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Imobiliaria4jPU");
        em = emf.createEntityManager();
    }

    public List<ClienteBean> listar(ClienteBean cliente) {
        logger.debug("Listando clientes");
        StringBuilder sb = new StringBuilder("select c from ClienteBean c where 1=1 ");

        if(cliente.getCodigo()!=null && cliente.getCodigo()!=0) {
            sb.append("and c.codigo=:c ");
        }
        if(cliente.getNome()!=null && !"".equals(cliente.getNome())) {
            sb.append("and c.nome like :n ");
        }
        if(cliente.getEmail()!=null && !"".equals(cliente.getEmail())) {
            sb.append("and c.email like :e ");
        }
        if(cliente.getTelefone()!=null && !"".equals(cliente.getTelefone())) {
            sb.append("and c.telefone like :t ");
        }

        sb.append("order by c.nome");
        
        Query qry = em.createQuery(sb.toString());
        if(cliente.getCodigo()!=null && cliente.getCodigo()!=0) {
            qry.setParameter("c", cliente.getCodigo());
        }
        if(cliente.getNome()!=null && !"".equals(cliente.getNome())) {
            qry.setParameter("n", "%" + cliente.getNome() + "%");
        }
        if(cliente.getEmail()!=null && !"".equals(cliente.getEmail())) {
            qry.setParameter("e", "%" + cliente.getEmail() + "%");
        }
        if(cliente.getTelefone()!=null && !"".equals(cliente.getTelefone())) {
            qry.setParameter("t", "%" + cliente.getTelefone() + "%");
        }
        
        return qry.getResultList();
    }

    public void salvar(ClienteBean cliente) {
        logger.debug("Salvando cliente");
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        logger.debug("Cliente salvo com sucesso");
    }

    public void excluir(ClienteBean cliente) {
        logger.debug("Excluindo cliente");
        em.getTransaction().begin();
        em.remove(em.find(ClienteBean.class, cliente.getCodigo()));
        em.getTransaction().commit();
        logger.debug("Cliente excluído com sucesso");
    }
    
}
