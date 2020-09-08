PACKAGES = "${PN} libpam-modules libpam-modules-bin libpam-runtime libpam0g"
PROVIDES = "libpam-modules libpam-modules-bin libpam-runtime libpam0g"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pam/libpam-modules_1.3.1-5_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/p/pam/libpam-modules-bin_1.3.1-5_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/p/pam/libpam-runtime_1.3.1-5_all.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/p/pam/libpam0g_1.3.1-5_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libpam-modules = "libpam-modules_1.3.1-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "d31c6c5f33be7d43c88008a927e6d1b12dfdea246b748f9c0a2298808c2096e7"
SRC_URI[deb0.md5sum] = "492c7859b1e0e0c1aed9f86595862a7f"
DEBFILENAME_libpam-modules-bin = "libpam-modules-bin_1.3.1-5_armhf.deb"
SRC_URI[deb1.sha256sum] = "0f62d43c7c689fac0ceca541af811b59f5bb100872af6c80afbf89470c32946d"
SRC_URI[deb1.md5sum] = "a8e64e1d8090a44eb9de03a6c46a5324"
DEBFILENAME_libpam-runtime = "libpam-runtime_1.3.1-5_all.deb"
SRC_URI[deb2.sha256sum] = "8aedc549e97e42fd21429d82a18ead489399ff4c15c6c688cdedea591eed9a66"
SRC_URI[deb2.md5sum] = "d1c2e1c55b1fd9756dc862b16535ff5e"
DEBFILENAME_libpam0g = "libpam0g_1.3.1-5_armhf.deb"
SRC_URI[deb3.sha256sum] = "55d7c5c7f50787c28ede7b8f4b026b804fcb8bf0dcdd5f485aced3ba3d76397b"
SRC_URI[deb3.md5sum] = "5766b64cacbd9ac232c12e82f9b7a1a7"

RDEPENDS_lib${PN}-modules = "debconf (>= 0.5) libaudit1 (>= 1:2.2.1) libc6 (>= 2.28) libdb5.3 libpam-modules-bin (= 1.3.1-5) libpam0g (>= 1.3.1) libselinux1 (>= 2.1.9)"
RDEPENDS_lib${PN}-modules-bin = "libaudit1 (>= 1:2.2.1) libc6 (>= 2.4) libpam0g (>= 0.99.7.1) libselinux1 (>= 1.32)"
RDEPENDS_lib${PN}-runtime = "debconf (>= 0.5) debconf (>= 1.5.19) libpam-modules (>= 1.0.1-6)"
RDEPENDS_lib${PN}0g = "debconf (>= 0.5) libaudit1 (>= 1:2.2.1) libc6 (>= 2.8)"
DEPENDS = "debconf libaudit1 libc6 libdb5.3 libselinux1"


inherit deb_group

FILES_libpam-modules = " \
    ./etc/security/access.conf \
    ./etc/security/group.conf \
    ./etc/security/limits.conf \
    ./etc/security/namespace.conf \
    ./etc/security/namespace.init \
    ./etc/security/pam_env.conf \
    ./etc/security/sepermit.conf \
    ./etc/security/time.conf \
    ./lib/arm-linux-gnueabihf/security/pam_access.so \
    ./lib/arm-linux-gnueabihf/security/pam_debug.so \
    ./lib/arm-linux-gnueabihf/security/pam_deny.so \
    ./lib/arm-linux-gnueabihf/security/pam_echo.so \
    ./lib/arm-linux-gnueabihf/security/pam_env.so \
    ./lib/arm-linux-gnueabihf/security/pam_exec.so \
    ./lib/arm-linux-gnueabihf/security/pam_faildelay.so \
    ./lib/arm-linux-gnueabihf/security/pam_filter.so \
    ./lib/arm-linux-gnueabihf/security/pam_ftp.so \
    ./lib/arm-linux-gnueabihf/security/pam_group.so \
    ./lib/arm-linux-gnueabihf/security/pam_issue.so \
    ./lib/arm-linux-gnueabihf/security/pam_keyinit.so \
    ./lib/arm-linux-gnueabihf/security/pam_lastlog.so \
    ./lib/arm-linux-gnueabihf/security/pam_limits.so \
    ./lib/arm-linux-gnueabihf/security/pam_listfile.so \
    ./lib/arm-linux-gnueabihf/security/pam_localuser.so \
    ./lib/arm-linux-gnueabihf/security/pam_loginuid.so \
    ./lib/arm-linux-gnueabihf/security/pam_mail.so \
    ./lib/arm-linux-gnueabihf/security/pam_mkhomedir.so \
    ./lib/arm-linux-gnueabihf/security/pam_motd.so \
    ./lib/arm-linux-gnueabihf/security/pam_namespace.so \
    ./lib/arm-linux-gnueabihf/security/pam_nologin.so \
    ./lib/arm-linux-gnueabihf/security/pam_permit.so \
    ./lib/arm-linux-gnueabihf/security/pam_pwhistory.so \
    ./lib/arm-linux-gnueabihf/security/pam_rhosts.so \
    ./lib/arm-linux-gnueabihf/security/pam_rootok.so \
    ./lib/arm-linux-gnueabihf/security/pam_securetty.so \
    ./lib/arm-linux-gnueabihf/security/pam_selinux.so \
    ./lib/arm-linux-gnueabihf/security/pam_sepermit.so \
    ./lib/arm-linux-gnueabihf/security/pam_shells.so \
    ./lib/arm-linux-gnueabihf/security/pam_stress.so \
    ./lib/arm-linux-gnueabihf/security/pam_succeed_if.so \
    ./lib/arm-linux-gnueabihf/security/pam_tally.so \
    ./lib/arm-linux-gnueabihf/security/pam_tally2.so \
    ./lib/arm-linux-gnueabihf/security/pam_time.so \
    ./lib/arm-linux-gnueabihf/security/pam_timestamp.so \
    ./lib/arm-linux-gnueabihf/security/pam_tty_audit.so \
    ./lib/arm-linux-gnueabihf/security/pam_umask.so \
    ./lib/arm-linux-gnueabihf/security/pam_unix.so \
    ./lib/arm-linux-gnueabihf/security/pam_userdb.so \
    ./lib/arm-linux-gnueabihf/security/pam_warn.so \
    ./lib/arm-linux-gnueabihf/security/pam_wheel.so \
    ./lib/arm-linux-gnueabihf/security/pam_xauth.so \
    ./usr/share/doc/libpam-modules/NEWS.Debian.gz \
    ./usr/share/doc/libpam-modules/changelog.Debian.gz \
    ./usr/share/doc/libpam-modules/changelog.gz \
    ./usr/share/doc/libpam-modules/copyright \
    ./usr/share/doc/libpam-modules/examples/upperLOWER.c \
    ./usr/share/lintian/overrides/libpam-modules \
    ./usr/share/man/man5/access.conf.5.gz \
    ./usr/share/man/man5/group.conf.5.gz \
    ./usr/share/man/man5/limits.conf.5.gz \
    ./usr/share/man/man5/namespace.conf.5.gz \
    ./usr/share/man/man5/pam_env.conf.5.gz \
    ./usr/share/man/man5/sepermit.conf.5.gz \
    ./usr/share/man/man5/time.conf.5.gz \
    ./usr/share/man/man7/pam_env.7.gz \
    ./usr/share/man/man7/pam_selinux.7.gz \
    ./usr/share/man/man8/pam_access.8.gz \
    ./usr/share/man/man8/pam_debug.8.gz \
    ./usr/share/man/man8/pam_deny.8.gz \
    ./usr/share/man/man8/pam_echo.8.gz \
    ./usr/share/man/man8/pam_exec.8.gz \
    ./usr/share/man/man8/pam_faildelay.8.gz \
    ./usr/share/man/man8/pam_filter.8.gz \
    ./usr/share/man/man8/pam_ftp.8.gz \
    ./usr/share/man/man8/pam_group.8.gz \
    ./usr/share/man/man8/pam_issue.8.gz \
    ./usr/share/man/man8/pam_keyinit.8.gz \
    ./usr/share/man/man8/pam_lastlog.8.gz \
    ./usr/share/man/man8/pam_limits.8.gz \
    ./usr/share/man/man8/pam_listfile.8.gz \
    ./usr/share/man/man8/pam_localuser.8.gz \
    ./usr/share/man/man8/pam_loginuid.8.gz \
    ./usr/share/man/man8/pam_mail.8.gz \
    ./usr/share/man/man8/pam_mkhomedir.8.gz \
    ./usr/share/man/man8/pam_motd.8.gz \
    ./usr/share/man/man8/pam_namespace.8.gz \
    ./usr/share/man/man8/pam_nologin.8.gz \
    ./usr/share/man/man8/pam_permit.8.gz \
    ./usr/share/man/man8/pam_pwhistory.8.gz \
    ./usr/share/man/man8/pam_rhosts.8.gz \
    ./usr/share/man/man8/pam_rootok.8.gz \
    ./usr/share/man/man8/pam_securetty.8.gz \
    ./usr/share/man/man8/pam_sepermit.8.gz \
    ./usr/share/man/man8/pam_shells.8.gz \
    ./usr/share/man/man8/pam_succeed_if.8.gz \
    ./usr/share/man/man8/pam_tally.8.gz \
    ./usr/share/man/man8/pam_tally2.8.gz \
    ./usr/share/man/man8/pam_time.8.gz \
    ./usr/share/man/man8/pam_timestamp.8.gz \
    ./usr/share/man/man8/pam_tty_audit.8.gz \
    ./usr/share/man/man8/pam_umask.8.gz \
    ./usr/share/man/man8/pam_unix.8.gz \
    ./usr/share/man/man8/pam_userdb.8.gz \
    ./usr/share/man/man8/pam_warn.8.gz \
    ./usr/share/man/man8/pam_wheel.8.gz \
    ./usr/share/man/man8/pam_xauth.8.gz \
    ./usr/share/pam-configs/mkhomedir\
"
FILES_libpam-modules-bin = " \
    ./sbin/mkhomedir_helper \
    ./sbin/pam_tally \
    ./sbin/pam_tally2 \
    ./sbin/unix_chkpwd \
    ./sbin/unix_update \
    ./usr/sbin/pam_timestamp_check \
    ./usr/share/doc/libpam-modules-bin/NEWS.Debian.gz \
    ./usr/share/doc/libpam-modules-bin/changelog.Debian.gz \
    ./usr/share/doc/libpam-modules-bin/changelog.gz \
    ./usr/share/doc/libpam-modules-bin/copyright \
    ./usr/share/lintian/overrides/libpam-modules-bin \
    ./usr/share/man/man8/mkhomedir_helper.8.gz \
    ./usr/share/man/man8/pam_timestamp_check.8.gz \
    ./usr/share/man/man8/unix_chkpwd.8.gz \
    ./usr/share/man/man8/unix_update.8.gz\
"
FILES_libpam-runtime = " \
    ./etc/pam.conf \
    ./etc/pam.d/other \
    ./usr/sbin/pam-auth-update \
    ./usr/sbin/pam_getenv \
    ./usr/share/doc/libpam-runtime/NEWS.Debian.gz \
    ./usr/share/doc/libpam-runtime/changelog.Debian.gz \
    ./usr/share/doc/libpam-runtime/changelog.gz \
    ./usr/share/doc/libpam-runtime/copyright \
    ./usr/share/lintian/overrides/libpam-runtime \
    ./usr/share/locale/af/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/am/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/anp/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ar/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/as/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ast/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/bal/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/be/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/bg/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/bn/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/bn_IN/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/bo/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/br/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/brx/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/bs/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ca/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/cs/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/cy/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/da/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/de/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/de_CH/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/el/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/en_GB/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/eo/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/es/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/et/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/eu/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/fa/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/fi/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/fr/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ga/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/gl/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/gu/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/he/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/hi/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/hr/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/hu/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ia/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/id/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ilo/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/is/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/it/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ja/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ka/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/kk/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/km/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/kn/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ko/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/kw/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/kw@kkcor/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/kw@uccor/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/kw_GB/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ky/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/lt/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/lv/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/mai/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/mk/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ml/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/mn/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/mr/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ms/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/my/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/nb/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/nds/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ne/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/nl/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/nn/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/nso/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/or/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/pa/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/pl/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/pt/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ro/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ru/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/si/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/sk/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/sl/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/sq/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/sr/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/sr@latin/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/sv/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ta/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/te/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/tg/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/th/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/tr/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/tw/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/uk/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/ur/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/vi/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/wba/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/yo/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/zh_HK/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/locale/zu/LC_MESSAGES/Linux-PAM.mo \
    ./usr/share/man/man5/pam.conf.5.gz \
    ./usr/share/man/man5/pam.d.5.gz \
    ./usr/share/man/man7/PAM.7.gz \
    ./usr/share/man/man7/pam.7.gz \
    ./usr/share/man/man8/pam-auth-update.8.gz \
    ./usr/share/man/man8/pam_getenv.8.gz \
    ./usr/share/pam-configs/unix \
    ./usr/share/pam/common-account \
    ./usr/share/pam/common-account.md5sums \
    ./usr/share/pam/common-auth \
    ./usr/share/pam/common-auth.md5sums \
    ./usr/share/pam/common-password \
    ./usr/share/pam/common-password.md5sums \
    ./usr/share/pam/common-session \
    ./usr/share/pam/common-session-noninteractive \
    ./usr/share/pam/common-session-noninteractive.md5sums \
    ./usr/share/pam/common-session.md5sums\
"
FILES_libpam0g = " \
    ./lib/arm-linux-gnueabihf/libpam.so.0 \
    ./lib/arm-linux-gnueabihf/libpam.so.0.84.2 \
    ./lib/arm-linux-gnueabihf/libpam_misc.so.0 \
    ./lib/arm-linux-gnueabihf/libpam_misc.so.0.82.1 \
    ./lib/arm-linux-gnueabihf/libpamc.so.0 \
    ./lib/arm-linux-gnueabihf/libpamc.so.0.82.1 \
    ./usr/share/doc/libpam0g/Debian-PAM-MiniPolicy.gz \
    ./usr/share/doc/libpam0g/NEWS.Debian.gz \
    ./usr/share/doc/libpam0g/README \
    ./usr/share/doc/libpam0g/README.Debian \
    ./usr/share/doc/libpam0g/TODO.Debian \
    ./usr/share/doc/libpam0g/changelog.Debian.gz \
    ./usr/share/doc/libpam0g/changelog.gz \
    ./usr/share/doc/libpam0g/copyright \
    ./usr/share/lintian/overrides/libpam0g\
"
