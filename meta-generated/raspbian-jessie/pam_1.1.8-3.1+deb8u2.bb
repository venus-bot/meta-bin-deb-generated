PACKAGES = "${PN} libpam-modules libpam-modules-bin libpam0g"
PROVIDES = "libpam-modules libpam-modules-bin libpam0g"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pam/libpam-modules_1.1.8-3.1+deb8u2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/pam/libpam-modules-bin_1.1.8-3.1+deb8u2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/p/pam/libpam0g_1.1.8-3.1+deb8u2_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_libpam-modules = "libpam-modules_1.1.8-3.1+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "9f2239a3d4686575ec80c3a0a5203ee195033466fad5a5823124a4a5063b2c42"
SRC_URI[deb0.md5sum] = "3bab6adc07f23c34ee04367506b9a855"
DEBFILENAME_libpam-modules-bin = "libpam-modules-bin_1.1.8-3.1+deb8u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "46a7f680cde310c993de5940bf6c5b5e8cac2d5dde00dcc923fb1258cf84891f"
SRC_URI[deb1.md5sum] = "d054e7f3ec74a61b8ceb517513445007"
DEBFILENAME_libpam0g = "libpam0g_1.1.8-3.1+deb8u2_armhf.deb"
SRC_URI[deb2.sha256sum] = "ed61b66555dc333db99754ed3f571b4d7f21baa035cca83dc863e57715d6d689"
SRC_URI[deb2.md5sum] = "9871400e6ead1e5bcbf846686cb40534"

RDEPENDS_lib${PN}-modules = "debconf (>= 0.5) libaudit1 (>= 1:2.2.1) libc6 (>= 2.15) libdb5.3 libpam-modules-bin (= 1.1.8-3.1+deb8u2) libpam0g (>= 1.1.3-2) libselinux1 (>= 2.1.9)"
RDEPENDS_lib${PN}-modules-bin = "libaudit1 (>= 1:2.2.1) libc6 (>= 2.4) libpam0g (>= 0.99.7.1) libselinux1 (>= 1.32)"
RDEPENDS_lib${PN}0g = "debconf (>= 0.5) libaudit1 (>= 1:2.2.1) libc6 (>= 2.8) multiarch-support"
DEPENDS = "debconf libaudit1 libc6 libdb5.3 libselinux1 multiarch-support"


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
    ./usr/share/man/man8/pam_access.8.gz \
    ./usr/share/man/man8/pam_debug.8.gz \
    ./usr/share/man/man8/pam_deny.8.gz \
    ./usr/share/man/man8/pam_echo.8.gz \
    ./usr/share/man/man8/pam_env.8.gz \
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
    ./usr/share/man/man8/pam_selinux.8.gz \
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
    ./usr/share/man/man8/pam_xauth.8.gz\
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
FILES_libpam0g = " \
    ./lib/arm-linux-gnueabihf/libpam.so.0 \
    ./lib/arm-linux-gnueabihf/libpam.so.0.83.1 \
    ./lib/arm-linux-gnueabihf/libpam_misc.so.0 \
    ./lib/arm-linux-gnueabihf/libpam_misc.so.0.82.0 \
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
