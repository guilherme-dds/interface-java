package application;

public class Main {
    public static void main(String[] args) {
        NotificacaoSms notifSMS = new NotificacaoSms("Guilherme", "(14) 997568741", "Mensagem teste", 1);

        notifSMS.exibirInformacoesRemetente();
        notifSMS.enviar();
        notifSMS.registrarLog();

        notifSMS.definirPrioridade(8);
        notifSMS.obterNivelPrioridade();
        notifSMS.definirPrioridade(0);

        Notificacao notif = new NotificacaoSms("Fulano", "14997568741", "Testando", 3);
        notif.exibirInformacoesRemetente();
        notif.enviar();

        Priorizavel objPriorizavel = new NotificacaoSms("Ciclano", "14943534593", "Novo teste", 2);
        objPriorizavel.definirPrioridade(6);
    }
}

