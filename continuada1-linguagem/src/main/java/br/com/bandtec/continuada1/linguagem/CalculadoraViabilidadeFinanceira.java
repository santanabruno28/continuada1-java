/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.continuada1.linguagem;

/**
 *
 * @author JOSE
 */
public class CalculadoraViabilidadeFinanceira extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraViabilidadeFinanceira
     */
    public CalculadoraViabilidadeFinanceira() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblQtdMaq = new javax.swing.JLabel();
        lblCustoTecnico = new javax.swing.JLabel();
        lblQtdMeses = new javax.swing.JLabel();
        tfQtdMaquinas = new javax.swing.JTextField();
        tfCustoTecnico = new javax.swing.JTextField();
        tfQtdMeses = new javax.swing.JTextField();
        btnBeneficios = new javax.swing.JButton();
        lblEconBrutoMensal = new javax.swing.JLabel();
        lblEconBrutoAnual = new javax.swing.JLabel();
        lblEconPorcMensal = new javax.swing.JLabel();
        lblEconPorcAnual = new javax.swing.JLabel();
        lblDescricaoDesc = new javax.swing.JLabel();
        lblValorAPagarMensal = new javax.swing.JLabel();
        lblValorAPagarAnual = new javax.swing.JLabel();
        lblTotalAPagar = new javax.swing.JLabel();
        lblEconTotal = new javax.swing.JLabel();
        lblEconTotalPorc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lblTitulo.setText("Calculadora de viabilidade financeira");

        lblQtdMaq.setText("Quantas Máquinas possui?");

        lblCustoTecnico.setText("Qual o custo de manutenção ou serviço pago à um técnico anualmente?");

        lblQtdMeses.setText("Por quantos meses pretende contratar nosso serviço?");

        tfQtdMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQtdMaquinasActionPerformed(evt);
            }
        });

        btnBeneficios.setText("Calcular Benefícios");
        btnBeneficios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeneficiosActionPerformed(evt);
            }
        });

        lblDescricaoDesc.setText("(15% de desconto à partir de 12 meses)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblQtdMeses)
                        .addGap(18, 18, 18)
                        .addComponent(tfQtdMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescricaoDesc)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCustoTecnico)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfCustoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQtdMaq)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfQtdMaquinas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTitulo)
                                    .addComponent(btnBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblEconBrutoAnual, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                                            .addComponent(lblEconTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblEconBrutoMensal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblEconTotalPorc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblEconPorcAnual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblEconPorcMensal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(lblValorAPagarMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblValorAPagarAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)))
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitulo)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdMaq)
                    .addComponent(tfQtdMaquinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustoTecnico)
                    .addComponent(tfCustoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdMeses)
                    .addComponent(tfQtdMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricaoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBeneficios)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEconBrutoMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEconPorcMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEconBrutoAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEconPorcAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEconTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEconTotalPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorAPagarMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorAPagarAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfQtdMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQtdMaquinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQtdMaquinasActionPerformed

    private void btnBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeneficiosActionPerformed
        
        // Limpar todos as labels para o caso do usuário queira fazer outra simulação com outros valores
        lblEconBrutoAnual.setText("");
        lblEconBrutoMensal.setText("");
        lblValorAPagarAnual.setText("");
        lblValorAPagarMensal.setText("");
        lblTotalAPagar.setText("");
        lblEconPorcAnual.setText("");
        lblEconPorcMensal.setText("");
        
        Integer qtdMaquinas = Integer.valueOf(tfQtdMaquinas.getText());
        Double custoTecnicoAnual = Double.valueOf(tfCustoTecnico.getText());
        Integer qtdMeses = Integer.valueOf(tfQtdMeses.getText());
        
        
        Double custoMensalAbaixoDe12Meses = 15.0;
        // - A partir de um ano (12 meses) de contratação do serviço, o valor por mês tem um desconto de 15%
        Double custoMensal12MesesOuMais = 12.75;
        
        // Custo total com um tempo de contratação à partir de um ano
        Double custoTotal12MesesOuMais = (custoMensal12MesesOuMais*qtdMeses) * qtdMaquinas;
        
        // Custo total com um tempo de contratação inferior a um ano
        Double custoTotalAbaixoDe12Meses = (custoMensalAbaixoDe12Meses*qtdMeses) * qtdMaquinas;
        
        // Custo Mensal com um tempo de contratação à partir de um ano
        Double custoMensalA = custoMensal12MesesOuMais * qtdMaquinas;
        // Custo Mensal com um tempo de contratação inferior a um ano
        Double custoMensalB = custoMensalAbaixoDe12Meses * qtdMaquinas;
        
        // Custo anual, obviamente o tempo de contratação será maior ou igual a um ano
        Double custoAnual = custoMensal12MesesOuMais * qtdMaquinas * 12;
        
        // Custo do técnico que a pessoa contrata mensalmente
        Double custoTecnicoMensal = custoTecnicoAnual / 12;
        
        // Custo total do técnico que a pessoa teria no prazo que ela está contratando o nosso serviço
        Double custoTecnicoTotal = custoTecnicoMensal * qtdMeses;
        
        
        
        
        
        // Se a quantidade de meses for superior ou igual a 12, todos os calculos terão a influência daqueles 15%
        if (qtdMeses >= 12) {
            Double economiaAnualBruta = custoTecnicoAnual - custoAnual;
            Double economiaAnualPorcentagem = (economiaAnualBruta/custoTecnicoAnual) *100;
            Double economiaMensalABruta = (custoTecnicoTotal - custoTotal12MesesOuMais) / qtdMeses;
            Double economiaMensalAPorcentagem = (economiaMensalABruta/custoTecnicoMensal) *100;
            Double economiaTotalABruta = custoTecnicoTotal - custoTotal12MesesOuMais;
            Double economiaTotalAPorcentagem = (economiaTotalABruta/custoTecnicoTotal) *100;
            
            lblEconBrutoAnual.setText(String.format("Economia anual: R$%.2f", economiaAnualBruta));
            lblEconPorcAnual.setText(String.format("Porcentagem economizada anualmente: %.1f por cento", economiaAnualPorcentagem));
            lblValorAPagarAnual.setText(String.format("Valor a pagar anualmente: R$%.2f", custoAnual));
            lblValorAPagarMensal.setText(String.format("Valor a pagar mensalmente: R$%.2f", custoMensalA));
            lblTotalAPagar.setText(String.format("Valor total a ser pago: R$%.2f", custoTotal12MesesOuMais));
            lblEconBrutoMensal.setText(String.format("Economia mensal: R$%.2f", economiaMensalABruta));
            lblEconPorcMensal.setText(String.format("Porcentagem Mensalmente economizada: %.1f por cento", economiaMensalAPorcentagem));
            lblEconTotal.setText(String.format("Total economizado -> %d meses -> R$%.2f", qtdMeses, economiaTotalABruta));
            lblEconTotalPorc.setText(String.format("Porcentagem total economizada: %.1f por cento", economiaTotalAPorcentagem));
            
        // Mas se a quantidade de meses for inferior a 12, os calculos serão feitos a partir do valor mensal cheio (R$15,00)    
        } else if (qtdMeses < 12) {
            Double economiaMensalBBruta = (custoTecnicoTotal - custoTotalAbaixoDe12Meses) / qtdMeses;
            Double economiaMensalBPorcentagem = (economiaMensalBBruta/custoTecnicoMensal) *100;
            Double economiaTotalBBruta = custoTecnicoTotal - custoTotalAbaixoDe12Meses;
            Double economiaTotalBPorcentagem = (economiaTotalBBruta/custoTecnicoTotal) *100;
            
            lblEconBrutoMensal.setText(String.format("Economia mensal: R$%.2f", economiaMensalBBruta));
            lblEconPorcMensal.setText(String.format("Porcentagem Mensalmente economizada: %.1f por cento", economiaMensalBPorcentagem));
            lblValorAPagarMensal.setText(String.format("Valor a pagar mensalmente: R$%.2f", custoMensalB));
            lblTotalAPagar.setText(String.format("Valor total a ser pago: R$%.2f", custoTotalAbaixoDe12Meses));
            lblEconTotal.setText(String.format("Total economizado -> %d meses -> R$%.2f", qtdMeses, economiaTotalBBruta));
            lblEconTotalPorc.setText(String.format("Porcentagem total economizada: %.1f por cento", economiaTotalBPorcentagem));
            
    }
        
        
        
        
    }//GEN-LAST:event_btnBeneficiosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraViabilidadeFinanceira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraViabilidadeFinanceira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraViabilidadeFinanceira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraViabilidadeFinanceira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraViabilidadeFinanceira().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeneficios;
    private javax.swing.JLabel lblCustoTecnico;
    private javax.swing.JLabel lblDescricaoDesc;
    private javax.swing.JLabel lblEconBrutoAnual;
    private javax.swing.JLabel lblEconBrutoMensal;
    private javax.swing.JLabel lblEconPorcAnual;
    private javax.swing.JLabel lblEconPorcMensal;
    private javax.swing.JLabel lblEconTotal;
    private javax.swing.JLabel lblEconTotalPorc;
    private javax.swing.JLabel lblQtdMaq;
    private javax.swing.JLabel lblQtdMeses;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalAPagar;
    private javax.swing.JLabel lblValorAPagarAnual;
    private javax.swing.JLabel lblValorAPagarMensal;
    private javax.swing.JTextField tfCustoTecnico;
    private javax.swing.JTextField tfQtdMaquinas;
    private javax.swing.JTextField tfQtdMeses;
    // End of variables declaration//GEN-END:variables
}
