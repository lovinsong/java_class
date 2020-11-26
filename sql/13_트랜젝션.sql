-- 13_Ʈ������.sql

/*
    # Ʈ����� (Transaction)
    
        - ������ ó���� �� ����
        - �ϳ��� ������ �۾��� ó���ϱ� ���� �������� ������
        - �۱� Ʈ������
            1. ������ ����� ���忡�� ���� �پ��
            2. �޴� ����� ���忡�� ���� �þ
        - ��ɾ��� ������ Ʈ������� ���������� ó���Ǵ� ��쿡�� ��� ó�� �ϵ��� �Ѵ�
        - All OR Nothing
        - COMMIT, ROLLBACK, SAVEPOINT�� �̿��� �����͸� ���������� ������ �� �ִ�
        - Ʈ������� ���������� ����� Ŀ��(Ȥ�� �ѹ�) ���ĺ���
          ���ο� Ŀ���� �����ϴ� �������� ����� ��� DML�� �ǹ��Ѵ�
                    (           DML             ) (DML�� �ƴϹǷ� Ʈ����� �ƴ�)
          COMMIT -> UPDATE -> INSERT -> UPDATE ->           CREATE               -> COMMIT(OR ROLLBACK)
*/

-- Ʈ����� ���߿� DDL(CREATE, DROP ���..)���� ����ϸ� �ڵ����� Ŀ���� �Ǳ� ������ �����ؾ� �Ѵ�
COMMIT;

SELECT * FROM emp;

UPDATE emp SET salary = 100;
-- CREATE TABLE ������ DDL�̱� ������ �ڵ����� Ŀ���� �߻��Ѵ�
CREATE TABLE fruits (
    fname VARCHAR2(30));

ROLLBACK;


-- SAVEPOINT�� �̿��� Ʈ����� ����
SELECT * FROM emp;

COMMIT;

UPDATE emp SET salary = 200;

SAVEPOINT save01;

UPDATE emp SET salary = 300;

SAVEPOINT save02;

UPDATE emp SET salary = 400;

SAVEPOINT save03;

ROLLBACK;

ROLLBACK TO save01; -- ���� ������ SAVEPOINT�θ� ���ư� �� �ִ�
















