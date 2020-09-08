PACKAGES = "${PN} libaudit-common libaudit1"
PROVIDES = "libaudit-common libaudit1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/a/audit/libaudit-common_2.4-1_all.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/a/audit/libaudit1_2.4-1+b1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libaudit-common = "libaudit-common_2.4-1_all.deb"
SRC_URI[deb0.sha256sum] = "be7f873c8f149b53b8cc3c337b067050d18208cb0de3f8cf6114a29bd20a17e3"
SRC_URI[deb0.md5sum] = "91f5a412f21ee9522262fa605a22b4df"
DEBFILENAME_libaudit1 = "libaudit1_2.4-1+b1_armhf.deb"
SRC_URI[deb1.sha256sum] = "9f903d0294ed09a5f36966c69db7bbc8ace8fe448cee1817690eccd964b22007"
SRC_URI[deb1.md5sum] = "cb3ffa162f2e935ed9a3bdc033a33887"

RDEPENDS_lib${PN}-common = ""
RDEPENDS_lib${PN}1 = "libaudit-common (>= 1:2.4-1) libc6 (>= 2.8) multiarch-support"
DEPENDS = "libc6 multiarch-support"


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
    ./usr/share/doc/libaudit1/changelog.Debian.armhf.gz \
    ./usr/share/doc/libaudit1/changelog.Debian.gz \
    ./usr/share/doc/libaudit1/changelog.gz \
    ./usr/share/doc/libaudit1/copyright\
"
