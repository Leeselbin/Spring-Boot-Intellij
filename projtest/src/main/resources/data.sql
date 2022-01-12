INSERT INTO article(id, title, content) VALUES (1, '가가가', '1111');
INSERT INTO article(id, title, content) VALUES (2, '나나나', '2222');
INSERT INTO article(id, title, content) VALUES (3, '다다다', '3333');

 -- article 더미 데이터
INSERT INTO article(id, title, content) VALUES (4, '당신의 인생여오하는', '댓글ㄱㄱ');
INSERT INTO article(id, title, content) VALUES (5, '췸,는?', '댓글ㄱㄱㄱ');
INSERT INTO article(id, title, content) VALUES (6, '당신의 소울푸드는', '댓글ㄱㄱㄱㄱ');

-- 4번 게시글의 댓글들
INSERT INTO comment(id, article_id, nickname, body) VALUES (1, 4, 'park', '어쩌라고');
INSERT INTO comment(id, article_id, nickname, body) VALUES (2, 4, 'kim', '어쩔티비');
INSERT INTO comment(id, article_id, nickname, body) VALUES (3, 4, 'lee', '어쩔어쩔');

-- 5번 게시글의 댓글들
INSERT INTO comment(id, article_id, nickname, body) VALUES (4, 5, 'park', '어쩌라고');
INSERT INTO comment(id, article_id, nickname, body) VALUES (5, 5, 'kim', '어쩔티비');
INSERT INTO comment(id, article_id, nickname, body) VALUES (6, 5, 'lee', '어쩔어쩔');

-- 6번 게시글의 댓글들
INSERT INTO comment(id, article_id, nickname, body) VALUES (7, 6, 'park', '어쩌라고');
INSERT INTO comment(id, article_id, nickname, body) VALUES (8, 6, 'kim', '어쩔티비');
INSERT INTO comment(id, article_id, nickname, body) VALUES (9, 6, 'lee', '어쩔어쩔');


