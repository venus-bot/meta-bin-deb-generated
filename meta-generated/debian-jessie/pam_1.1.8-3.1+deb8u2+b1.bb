PACKAGES = "${PN} libpam-modules libpam0g"
PROVIDES = "libpam-modules libpam0g"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pam/libpam-modules_1.1.8-3.1+deb8u2+b1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/p/pam/libpam0g_1.1.8-3.1+deb8u2+b1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libpam-modules = "libpam-modules_1.1.8-3.1+deb8u2+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "5939f9ae4621f5dc1486a034736bc334e0cb232834c28ad72831b7b7107abaf2"
SRC_URI[deb0.md5sum] = "cf7d1875d6f96845affea46bd452dc2c"
DEBFILENAME_libpam0g = "libpam0g_1.1.8-3.1+deb8u2+b1_armhf.deb"
SRC_URI[deb1.sha256sum] = "be22b07e9a62e113425e9104239dc08d90f99bdffbce8de9eeb384b032eae64f"
SRC_URI[deb1.md5sum] = "cb1544bd5c6839fafac0a8c6c2510e61"

RDEPENDS_lib${PN}0g = "libaudit1 (>= 1:2.2.1) libc6 (>= 2.8) debconf (>= 0.5)"
DEPENDS = "libaudit1 debconf libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

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
    ./usr/share/doc/libpam-modules/changelog.Debian.armhf.gz \
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
    ./usr/share/doc/libpam0g/changelog.Debian.armhf.gz \
    ./usr/share/doc/libpam0g/changelog.Debian.gz \
    ./usr/share/doc/libpam0g/changelog.gz \
    ./usr/share/doc/libpam0g/copyright \
    ./usr/share/lintian/overrides/libpam0g\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
