(set-logic QF_NRA_ODE)
(declare-fun x () Real)
(declare-fun y () Real)
(declare-fun qq () Real)
(declare-fun dam () Real)
(declare-fun omm () Real)
(declare-fun x_0_0 () Real)
(declare-fun x_0_t () Real)
(declare-fun y_0_0 () Real)
(declare-fun y_0_t () Real)
(declare-fun qq_0_0 () Real)
(declare-fun qq_0_t () Real)
(declare-fun dam_0_0 () Real)
(declare-fun dam_0_t () Real)
(declare-fun omm_0_0 () Real)
(declare-fun omm_0_t () Real)
(declare-fun time_0 () Real)
(declare-fun mode_0 () Real)
(define-ode flow_0 ( (= d/dt[x] y) (= d/dt[y] (- (* (- 0 omm) omm x) (* 2 dam omm y))) (= d/dt[qq] 1) (= d/dt[omm] 0) (= d/dt[dam] 0)))
(define-ode flow_1 ( (= d/dt[x] y) (= d/dt[y] (- (* (- 0 omm) omm x) (* 2 dam omm y))) (= d/dt[qq] 1) (= d/dt[omm] 0) (= d/dt[dam] 0)))
(define-ode flow_2 ( (= d/dt[x] y) (= d/dt[y] (- (* (- 0 omm) omm x) (* 2 dam omm y))) (= d/dt[qq] 1) (= d/dt[omm] 0) (= d/dt[dam] 0)))
(define-ode flow_3 ( (= d/dt[x] y) (= d/dt[y] (- (* (- 0 omm) omm x) (* 2 dam omm y))) (= d/dt[qq] 1) (= d/dt[omm] 0) (= d/dt[dam] 0)))
(assert (<= x_0_0 3.0))
(assert (<= -3.0 x_0_0))
(assert (<= x_0_t 3.0))
(assert (<= -3.0 x_0_t))
(assert (<= y_0_0 3.0))
(assert (<= -3.0 y_0_0))
(assert (<= y_0_t 3.0))
(assert (<= -3.0 y_0_t))
(assert (<= qq_0_0 100.0))
(assert (<= -1.0 qq_0_0))
(assert (<= qq_0_t 100.0))
(assert (<= -1.0 qq_0_t))
(assert (<= dam_0_0 3.0))
(assert (<= 0.0 dam_0_0))
(assert (<= dam_0_t 3.0))
(assert (<= 0.0 dam_0_t))
(assert (<= omm_0_0 7.0))
(assert (<= 0.0 omm_0_0))
(assert (<= omm_0_t 7.0))
(assert (<= 0.0 omm_0_t))
(assert (<= 0 time_0 [0.000000]))
(assert (<= time_0 100.0 [0.000000]))
(assert (<= 0 mode_0))
(assert (<= mode_0 3))
(assert (and
(= dam_0_0 0.1)
(= omm_0_0 1)
(= qq_0_0 0)
(= x_0_0 1)
(= y_0_0 -0.1)
(= mode_0 0)
(= [ x_0_t  y_0_t  qq_0_t  dam_0_t  omm_0_t ] (integral 0. time_0 [ x_0_0  y_0_0  qq_0_0  dam_0_0  omm_0_0 ] flow_0))
 (>= y_0_0 (- 0 x_0_0))
 (>= y_0_t (- 0 x_0_t))
 (forall_t 0 [0 time_0] (>= y_0_t (- 0 x_0_t)))
 (>= qq_0_t 4)
))
(check-sat)
(exit)
