PACKAGES = "${PN} libsemanage-common libsemanage1"
PROVIDES = "libsemanage-common libsemanage1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libsemanage/libsemanage-common_2.8-2_all.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libs/libsemanage/libsemanage1_2.8-2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsemanage-common = "libsemanage-common_2.8-2_all.deb"
SRC_URI[deb0.sha256sum] = "fa3c50e11afa9250f823218898084bdefea73c7cd1995ef5ed5e7c12e7b46331"
SRC_URI[deb0.md5sum] = "72901b0a9a02bc87eada67dda551c77f"
DEBFILENAME_libsemanage1 = "libsemanage1_2.8-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "7f403dccd00375eb91786db9fbea41496833cb9391f78bd6ea1136d83203b325"
SRC_URI[deb1.md5sum] = "d1f380f55cff678a42571a61f4fdd697"

RDEPENDS_${PN}-common = ""
RDEPENDS_${PN}1 = "libaudit1 (>= 1:2.2.1) libbz2-1.0 libc6 (>= 2.28) libselinux1 (>= 2.8) libsemanage-common (= 2.8-2) libsepol1 (>= 2.8)"
DEPENDS = "libaudit1 libbz2-1.0 libc6 libselinux1 libsepol1"


inherit deb_group

FILES_libsemanage-common = " \
    ./etc/selinux/semanage.conf \
    ./usr/share/doc/libsemanage-common/changelog.Debian.gz \
    ./usr/share/doc/libsemanage-common/copyright \
    ./usr/share/man/man5/semanage.conf.5.gz\
"
FILES_libsemanage1 = " \
    ./usr/lib/arm-linux-gnueabihf/libsemanage.so.1 \
    ./usr/share/doc/libsemanage1/changelog.Debian.gz \
    ./usr/share/doc/libsemanage1/copyright\
"
