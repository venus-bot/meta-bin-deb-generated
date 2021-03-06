PACKAGES = "${PN} libaudit-common libaudit1"
PROVIDES = "libaudit-common libaudit1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/a/audit/libaudit-common_2.8.4-3_all.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/a/audit/libaudit1_2.8.4-3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libaudit-common = "libaudit-common_2.8.4-3_all.deb"
SRC_URI[deb0.sha256sum] = "4e51dc247cde083528d410f525c6157b08be8b69511891cf972bc87025311371"
SRC_URI[deb0.md5sum] = "fbdd4d478b3a355f704b76e97b8c941e"
DEBFILENAME_libaudit1 = "libaudit1_2.8.4-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "b74394e2a71afa4bddd5f68cc29b7bf75f63188f76d1ee4149ab02be5ee73038"
SRC_URI[deb1.md5sum] = "42c682545bc4aeafe06082ecc4f8d3ec"

RDEPENDS_lib${PN}-common = ""
RDEPENDS_lib${PN}1 = "libaudit-common (>= 1:2.8.4-3) libc6 (>= 2.28) libcap-ng0 (>= 0.7.9)"
DEPENDS = "libc6 libcap-ng0"


inherit deb_group

FILES_libaudit-common = " \
    ./etc/libaudit.conf \
    ./usr/share/doc/libaudit-common/changelog.Debian.gz \
    ./usr/share/doc/libaudit-common/changelog.gz \
    ./usr/share/doc/libaudit-common/copyright \
    ./usr/share/man/man5/libaudit.conf.5.gz\
"
FILES_libaudit1 = " \
    ./lib/arm-linux-gnueabihf/libaudit.so.1 \
    ./lib/arm-linux-gnueabihf/libaudit.so.1.0.0 \
    ./usr/share/doc/libaudit1/changelog.Debian.gz \
    ./usr/share/doc/libaudit1/changelog.gz \
    ./usr/share/doc/libaudit1/copyright\
"
