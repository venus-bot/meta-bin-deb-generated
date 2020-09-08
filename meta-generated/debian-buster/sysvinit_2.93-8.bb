PACKAGES = "${PN} initscripts sysv-rc sysvinit-utils"
PROVIDES = "initscripts sysv-rc sysvinit-utils"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/sysvinit/initscripts_2.93-8_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/s/sysvinit/sysv-rc_2.93-8_all.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/s/sysvinit/sysvinit-utils_2.93-8_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_initscripts = "initscripts_2.93-8_armhf.deb"
SRC_URI[deb0.sha256sum] = "f589575337b41747d845d9ea0840a2fc244f955231151fbfbd7df19e317873b9"
SRC_URI[deb0.md5sum] = "0e7499f5da36b8ddc700aa5198a8c505"
DEBFILENAME_sysv-rc = "sysv-rc_2.93-8_all.deb"
SRC_URI[deb1.sha256sum] = "8e4f42902dc87514a73c1457523ac55bc9799e54c414e9ba4062a4ba52489ebc"
SRC_URI[deb1.md5sum] = "b8d25c8c7ad9f48d9b7e053ceedca80d"
DEBFILENAME_sysvinit-utils = "sysvinit-utils_2.93-8_armhf.deb"
SRC_URI[deb2.sha256sum] = "d2d35dc999ed8a16c89f3789416f7c563b7b4b504f2729927351d75b17aa3681"
SRC_URI[deb2.md5sum] = "b26cf8ebef2ea65068da9030620154fc"

RDEPENDS_initscripts = "coreutils (>= 5.93) debianutils (>= 4) lsb-base (>= 3.2-14) mount sysv-rc sysvinit-utils (>= 2.88dsf-59.5)"
RDEPENDS_sysv-rc = "init-system-helpers (>= 1.25~) insserv (>> 1.12.0-10) startpar sysvinit-utils (>= 2.86.ds1-62)"
RDEPENDS_${PN}-utils = "init-system-helpers (>= 1.25~) libc6 (>= 2.4) util-linux (>> 2.28-2~)"
DEPENDS = "coreutils debianutils init-system-helpers insserv libc6 lsb-base mount startpar util-linux"


inherit deb_group

FILES_initscripts = " \
    ./etc/default/devpts \
    ./etc/default/halt \
    ./etc/default/rcS \
    ./etc/default/tmpfs \
    ./etc/init.d/bootlogs \
    ./etc/init.d/bootmisc.sh \
    ./etc/init.d/brightness \
    ./etc/init.d/checkfs.sh \
    ./etc/init.d/checkroot-bootclean.sh \
    ./etc/init.d/checkroot.sh \
    ./etc/init.d/halt \
    ./etc/init.d/hostname.sh \
    ./etc/init.d/killprocs \
    ./etc/init.d/mountall-bootclean.sh \
    ./etc/init.d/mountall.sh \
    ./etc/init.d/mountdevsubfs.sh \
    ./etc/init.d/mountkernfs.sh \
    ./etc/init.d/mountnfs-bootclean.sh \
    ./etc/init.d/mountnfs.sh \
    ./etc/init.d/rc.local \
    ./etc/init.d/reboot \
    ./etc/init.d/rmnologin \
    ./etc/init.d/sendsigs \
    ./etc/init.d/single \
    ./etc/init.d/umountfs \
    ./etc/init.d/umountnfs.sh \
    ./etc/init.d/umountroot \
    ./etc/init.d/urandom \
    ./etc/network/if-up.d/mountnfs \
    ./lib/init/bootclean.sh \
    ./lib/init/mount-functions.sh \
    ./lib/init/tmpfs.sh \
    ./sbin/fsck.nfs \
    ./usr/share/doc/initscripts/NEWS.Debian.gz \
    ./usr/share/doc/initscripts/README.Debian \
    ./usr/share/doc/initscripts/changelog.Debian.gz \
    ./usr/share/doc/initscripts/changelog.gz \
    ./usr/share/doc/initscripts/copyright \
    ./usr/share/lintian/overrides/initscripts \
    ./usr/share/man/man5/halt.5.gz \
    ./usr/share/man/man5/rcS.5.gz \
    ./usr/share/man/man5/tmpfs.5.gz \
    ./usr/share/man/man8/fsck.nfs.8.gz\
"
FILES_sysv-rc = " \
    ./etc/init.d/README \
    ./etc/init.d/rc \
    ./etc/init.d/rcS \
    ./etc/rc0.d/README \
    ./etc/rc1.d/README \
    ./etc/rc2.d/README \
    ./etc/rc3.d/README \
    ./etc/rc4.d/README \
    ./etc/rc5.d/README \
    ./etc/rc6.d/README \
    ./etc/rcS.d/README \
    ./lib/init/rc \
    ./lib/init/rcS \
    ./usr/share/doc/sysv-rc/NEWS.Debian.gz \
    ./usr/share/doc/sysv-rc/README.Debian \
    ./usr/share/doc/sysv-rc/README.runlevels.gz \
    ./usr/share/doc/sysv-rc/changelog.Debian.gz \
    ./usr/share/doc/sysv-rc/changelog.gz \
    ./usr/share/doc/sysv-rc/copyright \
    ./usr/share/lintian/overrides/sysv-rc \
    ./usr/share/sysv-rc/saveconfig\
"
FILES_sysvinit-utils = " \
    ./bin/pidof \
    ./lib/init/init-d-script \
    ./lib/init/vars.sh \
    ./sbin/fstab-decode \
    ./sbin/killall5 \
    ./usr/share/doc/sysvinit-utils/NEWS.Debian.gz \
    ./usr/share/doc/sysvinit-utils/changelog.Debian.gz \
    ./usr/share/doc/sysvinit-utils/changelog.gz \
    ./usr/share/doc/sysvinit-utils/copyright \
    ./usr/share/man/man5/init-d-script.5.gz \
    ./usr/share/man/man8/fstab-decode.8.gz \
    ./usr/share/man/man8/killall5.8.gz \
    ./usr/share/man/man8/pidof.8.gz\
"
