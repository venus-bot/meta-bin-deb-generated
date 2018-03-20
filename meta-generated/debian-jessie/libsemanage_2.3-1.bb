PACKAGES = "${PN} libsemanage-common libsemanage1"
PROVIDES = "libsemanage-common libsemanage1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libs/libsemanage/libsemanage-common_2.3-1_all.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libs/libsemanage/libsemanage1_2.3-1+b1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsemanage-common = "libsemanage-common_2.3-1_all.deb"
SRC_URI[deb0.sha256sum] = "6cee4cf858797141ecb5775f33a82cb7ffb5d2c047a0fb9f4ed08005b9c33671"
SRC_URI[deb0.md5sum] = "0b201e8dac4668c70a6755ef82e0ece1"
DEBFILENAME_libsemanage1 = "libsemanage1_2.3-1+b1_armhf.deb"
SRC_URI[deb1.sha256sum] = "e0f70f1a724706445dbf2df823fff6e911ce9f1bf37417c59bb592e234acc0d3"
SRC_URI[deb1.md5sum] = "6801173500c4fa44521c59262d549dc4"

RDEPENDS_${PN}1 = "libsemanage-common (= 2.3-1) libaudit1 (>= 1:2.2.1) libbz2-1.0 libc6 (>= 2.8) libselinux1 (>= 2.1.12) libsepol1 (>= 2.1.4) libustr-1.0-1 (>= 1.0.4)"
DEPENDS = "libsepol1 libc6 libselinux1 libustr-1.0-1 libaudit1 libbz2-1.0"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsemanage-common = " \
    ./etc/selinux/semanage.conf \
    ./usr/share/doc/libsemanage-common/changelog.Debian.gz \
    ./usr/share/doc/libsemanage-common/changelog.gz \
    ./usr/share/doc/libsemanage-common/copyright \
    ./usr/share/man/man5/semanage.conf.5.gz\
"
FILES_libsemanage1 = " \
    ./usr/lib/arm-linux-gnueabihf/libsemanage.so.1 \
    ./usr/share/doc/libsemanage1/changelog.Debian.armhf.gz \
    ./usr/share/doc/libsemanage1/changelog.Debian.gz \
    ./usr/share/doc/libsemanage1/changelog.gz \
    ./usr/share/doc/libsemanage1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
