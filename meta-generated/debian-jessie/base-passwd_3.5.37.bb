PACKAGES = "${PN} base-passwd"
PROVIDES = "base-passwd"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/base-passwd/base-passwd_3.5.37_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_base-passwd = "base-passwd_3.5.37_armhf.deb"
SRC_URI[deb0.sha256sum] = "30bb77634887470c76c4b6e59c8596fda3f18464e25565f6871e7c3ea0050ace"
SRC_URI[deb0.md5sum] = "94e8a5f0b6a348c0af68bcd2aac76022"

RDEPENDS_${PN} = "libc6 (>= 2.8) libdebconfclient0 (>= 0.145)"
DEPENDS = "libc6 libdebconfclient0"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/share/lintian/overrides/base-passwd \
    ./usr/share/man/man8/update-passwd.8.gz \
    ./usr/share/doc/base-passwd/changelog.gz \
    ./usr/share/base-passwd/passwd.master \
    ./usr/share/doc/base-passwd/users-and-groups.txt.gz \
    ./usr/share/doc/base-passwd/users-and-groups.html \
    ./usr/sbin/update-passwd \
    ./usr/share/doc/base-passwd/README \
    ./usr/share/base-passwd/group.master \
    ./usr/share/man/pl/man8/update-passwd.8.gz \
    ./usr/share/doc/base-passwd/copyright \
    ./usr/share/man/ru/man8/update-passwd.8.gz \
    ./usr/share/doc-base/users-and-groups \
    ./usr/share/man/fr/man8/update-passwd.8.gz \
    ./usr/share/man/ja/man8/update-passwd.8.gz \
    ./usr/share/man/es/man8/update-passwd.8.gz \
    ./usr/share/man/de/man8/update-passwd.8.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
