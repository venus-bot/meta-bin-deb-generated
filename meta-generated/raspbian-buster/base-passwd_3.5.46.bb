PACKAGES = "${PN} base-passwd"
PROVIDES = "base-passwd"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/base-passwd/base-passwd_3.5.46_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_base-passwd = "base-passwd_3.5.46_armhf.deb"
SRC_URI[deb0.sha256sum] = "f286e0870ebc0de21acce32074cd99359d4dbcb64ba9ebda6ca20965cd832d66"
SRC_URI[deb0.md5sum] = "97576b5a93ac8e2b26774fd71ed490a4"

RDEPENDS_${PN} = "libc6 (>= 2.8) libdebconfclient0 (>= 0.145)"
DEPENDS = "libc6 libdebconfclient0"


inherit deb_group

FILES_${PN} = " \
    ./usr/sbin/update-passwd \
    ./usr/share/base-passwd/group.master \
    ./usr/share/base-passwd/passwd.master \
    ./usr/share/doc-base/users-and-groups \
    ./usr/share/doc/base-passwd/README \
    ./usr/share/doc/base-passwd/changelog.gz \
    ./usr/share/doc/base-passwd/copyright \
    ./usr/share/doc/base-passwd/users-and-groups.html \
    ./usr/share/doc/base-passwd/users-and-groups.txt.gz \
    ./usr/share/lintian/overrides/base-passwd \
    ./usr/share/man/de/man8/update-passwd.8.gz \
    ./usr/share/man/es/man8/update-passwd.8.gz \
    ./usr/share/man/fr/man8/update-passwd.8.gz \
    ./usr/share/man/ja/man8/update-passwd.8.gz \
    ./usr/share/man/man8/update-passwd.8.gz \
    ./usr/share/man/pl/man8/update-passwd.8.gz \
    ./usr/share/man/ru/man8/update-passwd.8.gz\
"
