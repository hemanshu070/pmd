/* Generated By:JJTree: Do not edit this line. ASTPrimaryExpression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTPrimaryExpression extends SimpleNode {
  public ASTPrimaryExpression(int id) {
    super(id);
  }

  public ASTPrimaryExpression(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f920ddc8f49dc2cb02168cf6dd9c8888 (do not edit this line) */
