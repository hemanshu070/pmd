/* Generated By:JJTree: Do not edit this line. ASTMethodDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTMethodDeclaration extends SimpleNode {
  public ASTMethodDeclaration(int id) {
    super(id);
  }

  public ASTMethodDeclaration(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1a1499fc11627211f4558564c6dcd74d (do not edit this line) */
