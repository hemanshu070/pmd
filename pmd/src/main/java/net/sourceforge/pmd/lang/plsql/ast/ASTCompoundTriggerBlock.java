/* Generated By:JJTree: Do not edit this line. ASTCompoundTriggerBlock.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTCompoundTriggerBlock extends SimpleNode {
  public ASTCompoundTriggerBlock(int id) {
    super(id);
  }

  public ASTCompoundTriggerBlock(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=882971fc5207ac5a73652b70c1c15282 (do not edit this line) */
